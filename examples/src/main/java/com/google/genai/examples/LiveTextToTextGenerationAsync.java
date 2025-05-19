/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Usage:
 *
 * <p>1a. If you are using Vertex AI, setup ADC to get credentials:
 * https://cloud.google.com/docs/authentication/provide-credentials-adc#google-idp
 *
 * <p>Then set Project, Location, and USE_VERTEXAI flag as environment variables:
 *
 * <p>export GOOGLE_CLOUD_PROJECT=YOUR_PROJECT
 *
 * <p>export GOOGLE_CLOUD_LOCATION=YOUR_LOCATION
 *
 * <p>export GOOGLE_GENAI_USE_VERTEXAI=true
 *
 * <p>1b. If you are using Gemini Developer AI, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile
 *
 * <p>mvn exec:java -Dexec.mainClass="com.google.genai.examples.LiveTextToTextGenerationAsync"
 */
package com.google.genai.examples;

import com.google.common.collect.ImmutableList;
import com.google.genai.AsyncSession;
import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.LiveConnectConfig;
import com.google.genai.types.LiveSendClientContentParameters;
import com.google.genai.types.LiveServerContent;
import com.google.genai.types.LiveServerMessage;
import com.google.genai.types.Modality;
import com.google.genai.types.Part;
import java.util.concurrent.CompletableFuture;

/** Example of using the live module to send and receive text messages asynchronously. */
public final class LiveTextToTextGenerationAsync {

  public static void main(String[] args) {
    // Instantiate the client. The client by default uses the Gemini Developer API. It gets the API
    // key from the environment variable `GOOGLE_API_KEY`. Vertex AI API can be used by setting the
    // environment variables `GOOGLE_CLOUD_LOCATION` and `GOOGLE_CLOUD_PROJECT`, as well as setting
    // `GOOGLE_GENAI_USE_VERTEXAI` to "true".
    //
    // Note: Some services are only available in a specific API backend (Gemini or Vertex), you will
    // get a `UnsupportedOperationException` if you try to use a service that is not available in
    // the backend you are using.
    Client client = new Client();

    if (client.vertexAI()) {
      System.out.println("Using Vertex AI");
    } else {
      System.out.println("Using Gemini Developer API");
    }

    LiveConnectConfig config =
        LiveConnectConfig.builder()
            .responseModalitiesFromKnown(ImmutableList.of(Modality.Known.TEXT))
            .build();

    CompletableFuture<Void> allDone = new CompletableFuture<>();

    String modelName;
    if (client.vertexAI()) {
      modelName = "gemini-2.0-flash-live-preview-04-09";
    } else {
      modelName = "gemini-2.0-flash-live-001";
    }

    CompletableFuture<AsyncSession> futureSession = client.async.live.connect(modelName, config);

    futureSession
        .thenCompose(
            session -> {
              String inputText = "Write a short poem about a cat.";
              System.out.println("\n**Input**\n" + inputText);

              return session
                  // Send the input message.
                  .sendClientContent(clientContentFromText(inputText))
                  .thenCompose(
                      unused -> {
                        System.out.print("\n**Response**\n");
                        // Receive messages from the live session.
                        return session.receive(message -> printLiveServerMessage(message, allDone));
                      })
                  .thenCompose(unused -> allDone)
                  .thenCompose(unused -> session.close());
            })
        .join();
  }

  public static LiveSendClientContentParameters clientContentFromText(String text) {
    return LiveSendClientContentParameters.builder()
        .turnComplete(true)
        .turns(
            ImmutableList.of(
                Content.builder()
                    .parts(ImmutableList.of(Part.builder().text(text).build()))
                    .build()))
        .build();
  }

  public static void printLiveServerMessage(
      LiveServerMessage message, CompletableFuture<Void> allDone) {
    if (message.serverContent().isPresent()) {
      LiveServerContent content = message.serverContent().get();
      if (content.modelTurn().isPresent()) {
        Content modelTurn = content.modelTurn().get();
        for (Part part : modelTurn.parts().orElse(ImmutableList.of())) {
          if (part.text().isPresent()) {
            System.out.print(part.text().get());
          }
        }
      }
      if (content.turnComplete().orElse(false)) {
        System.out.println();
        allDone.complete(null);
      }
    }
  }

  private LiveTextToTextGenerationAsync() {}
}
