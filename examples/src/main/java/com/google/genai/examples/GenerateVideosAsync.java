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
 * <p>1b. If you are using Gemini Developer AI, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile exec:java -Dexec.mainClass="com.google.genai.examples.GenerateVideosAsync"
 */
package com.google.genai.examples;

import com.google.genai.Client;
import com.google.genai.types.GenerateVideosConfig;
import com.google.genai.types.GenerateVideosOperation;
import com.google.genai.types.Video;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/** An example of using the Unified Gen AI Java SDK to generate images asynchronously. */
public class GenerateVideosAsync {
  public static void main(String[] args) {
    // Instantiates the client using Vertex AI, and sets the project and location in the builder.
    Client client =
        Client.builder()
            .vertexAI(true)
            .project(System.getenv("GOOGLE_CLOUD_PROJECT"))
            .location(System.getenv("GOOGLE_CLOUD_LOCATION"))
            .build();

    GenerateVideosConfig.Builder generateVideosConfigBuilder =
        GenerateVideosConfig.builder().numberOfVideos(1);

    if (client.vertexAI()) {
      generateVideosConfigBuilder.outputGcsUri("gs://genai-sdk-tests/tmp/videos");
    }
    GenerateVideosConfig generateVideosConfig = generateVideosConfigBuilder.build();

    CompletableFuture<GenerateVideosOperation> generateVideosOperationFuture =
        client.async.models.generateVideos(
            "veo-2.0-generate-001",
            "A neon hologram of a cat driving at top speed",
            null,
            generateVideosConfig);

    generateVideosOperationFuture
        .thenAccept(
            generateVideosOperation -> {
              // Don't mutate lambda expression variable
              GenerateVideosOperation operation = generateVideosOperation;
              while (!operation.done().filter(Boolean::booleanValue).isPresent()) {
                try {
                  Thread.sleep(10000); // Sleep for 10 seconds.
                  try {
                    operation = client.async.operations.getVideoOperation(operation, null).get();
                  } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                  }
                  System.out.println("Waiting for operation to complete...");
                } catch (InterruptedException e) {
                  System.out.println("Thread was interrupted while sleeping.");
                  Thread.currentThread().interrupt();
                }
              }
              System.out.println(
                  "Generated "
                      + operation.response().get().generatedVideos().get().size()
                      + " video(s).");

              Video generatedVideo =
                  operation.response().get().generatedVideos().get().get(0).video().get();
              // Do something with the video.
            })
        .join();
  }
}
