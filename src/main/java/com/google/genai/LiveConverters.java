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

// Auto-generated code. Do not edit.

package com.google.genai;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

final class LiveConverters {
  private final ApiClient apiClient;

  public LiveConverters(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"videoMetadata"}))) {
      throw new IllegalArgumentException("videoMetadata parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(partToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(partToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode dynamicRetrievalConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode dynamicRetrievalConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchRetrievalToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          dynamicRetrievalConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchRetrievalToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          dynamicRetrievalConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"retrieval"}))) {
      throw new IllegalArgumentException("retrieval parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          googleSearchToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          googleSearchRetrievalToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionDeclarations"},
          Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"retrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"retrieval"},
          Common.getValueByPath(fromObject, new String[] {"retrieval"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          googleSearchToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          googleSearchRetrievalToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionDeclarations"},
          Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode sessionResumptionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"handle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"handle"},
          Common.getValueByPath(fromObject, new String[] {"handle"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"transparent"}))) {
      throw new IllegalArgumentException("transparent parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode sessionResumptionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"handle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"handle"},
          Common.getValueByPath(fromObject, new String[] {"handle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"transparent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"transparent"},
          Common.getValueByPath(fromObject, new String[] {"transparent"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode audioTranscriptionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode audioTranscriptionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode automaticActivityDetectionToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"disabled"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disabled"},
          Common.getValueByPath(fromObject, new String[] {"disabled"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"startOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"endOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prefixPaddingMs"},
          Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"silenceDurationMs"},
          Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode automaticActivityDetectionToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"disabled"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disabled"},
          Common.getValueByPath(fromObject, new String[] {"disabled"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"startOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"endOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prefixPaddingMs"},
          Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"silenceDurationMs"},
          Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode realtimeInputConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"automaticActivityDetection"},
          automaticActivityDetectionToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityHandling"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityHandling"},
          Common.getValueByPath(fromObject, new String[] {"activityHandling"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnCoverage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnCoverage"},
          Common.getValueByPath(fromObject, new String[] {"turnCoverage"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode realtimeInputConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"automaticActivityDetection"},
          automaticActivityDetectionToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityHandling"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityHandling"},
          Common.getValueByPath(fromObject, new String[] {"activityHandling"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnCoverage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnCoverage"},
          Common.getValueByPath(fromObject, new String[] {"turnCoverage"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode slidingWindowToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"targetTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"targetTokens"},
          Common.getValueByPath(fromObject, new String[] {"targetTokens"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode slidingWindowToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"targetTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"targetTokens"},
          Common.getValueByPath(fromObject, new String[] {"targetTokens"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contextWindowCompressionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"triggerTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"triggerTokens"},
          Common.getValueByPath(fromObject, new String[] {"triggerTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"slidingWindow"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"slidingWindow"},
          slidingWindowToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"slidingWindow"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contextWindowCompressionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"triggerTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"triggerTokens"},
          Common.getValueByPath(fromObject, new String[] {"triggerTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"slidingWindow"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"slidingWindow"},
          slidingWindowToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"slidingWindow"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveConnectConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "speechConfig"},
          Common.getValueByPath(fromObject, new String[] {"speechConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "systemInstruction"},
          contentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                toolToMldev(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"setup", "tools"}, result);
    }

    if (!Common.isZero(
        Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}))) {
      throw new IllegalArgumentException(
          "inputAudioTranscription parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "outputAudioTranscription"},
          audioTranscriptionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "realtimeInputConfig"},
          realtimeInputConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "contextWindowCompression"},
          contextWindowCompressionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveConnectConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "speechConfig"},
          Common.getValueByPath(fromObject, new String[] {"speechConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "systemInstruction"},
          contentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                toolToVertex(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"setup", "tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "inputAudioTranscription"},
          audioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "outputAudioTranscription"},
          audioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "realtimeInputConfig"},
          realtimeInputConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "contextWindowCompression"},
          contextWindowCompressionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveConnectParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          liveConnectConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveConnectParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          liveConnectConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode activityStartToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode activityStartToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode activityEndToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode activityEndToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveSendRealtimeInputParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"media"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Transformers.tBlobs(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"media"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityStart"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityStart"},
          activityStartToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityStart"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityEnd"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityEnd"},
          activityEndToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityEnd"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveSendRealtimeInputParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"media"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Transformers.tBlobs(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"media"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityStart"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityStart"},
          activityStartToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityStart"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityEnd"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityEnd"},
          activityEndToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityEnd"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientSetupToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"systemInstruction"},
          contentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                toolToMldev(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(toObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInputConfig"},
          realtimeInputConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"contextWindowCompression"},
          contextWindowCompressionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"})),
              toObject));
    }

    if (!Common.isZero(
        Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}))) {
      throw new IllegalArgumentException(
          "inputAudioTranscription parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputAudioTranscription"},
          audioTranscriptionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientSetupToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"systemInstruction"},
          contentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                toolToVertex(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(toObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInputConfig"},
          realtimeInputConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInputConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"contextWindowCompression"},
          contextWindowCompressionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"contextWindowCompression"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputAudioTranscription"},
          audioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputAudioTranscription"},
          audioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientContentToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"turns"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"turns"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(contentToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"turns"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientContentToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"turns"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"turns"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(contentToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"turns"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientRealtimeInputToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mediaChunks"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Common.getValueByPath(fromObject, new String[] {"mediaChunks"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityStart"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityStart"},
          activityStartToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityStart"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityEnd"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityEnd"},
          activityEndToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityEnd"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientRealtimeInputToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mediaChunks"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Common.getValueByPath(fromObject, new String[] {"mediaChunks"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityStart"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityStart"},
          activityStartToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityStart"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityEnd"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityEnd"},
          activityEndToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"activityEnd"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode functionResponseToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode functionResponseToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"id"}))) {
      throw new IllegalArgumentException("id parameter is not supported in Vertex AI.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientToolResponseToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionResponses"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionResponses"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                functionResponseToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionResponses"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientToolResponseToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionResponses"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionResponses"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                functionResponseToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionResponses"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientMessageToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setup"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup"},
          liveClientSetupToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setup"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"clientContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"clientContent"},
          liveClientContentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"clientContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInput"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInput"},
          liveClientRealtimeInputToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInput"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolResponse"},
          liveClientToolResponseToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolResponse"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveClientMessageToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setup"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup"},
          liveClientSetupToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setup"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"clientContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"clientContent"},
          liveClientContentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"clientContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInput"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInput"},
          liveClientRealtimeInputToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInput"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolResponse"},
          liveClientToolResponseToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolResponse"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerSetupCompleteFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerSetupCompleteFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(partFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(partFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode transcriptionFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finished"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finished"},
          Common.getValueByPath(fromObject, new String[] {"finished"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode transcriptionFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finished"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finished"},
          Common.getValueByPath(fromObject, new String[] {"finished"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerContentFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modelTurn"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelTurn"},
          contentFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"modelTurn"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"interrupted"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"interrupted"},
          Common.getValueByPath(fromObject, new String[] {"interrupted"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"groundingMetadata"},
          Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationComplete"},
          Common.getValueByPath(fromObject, new String[] {"generationComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputTranscription"},
          transcriptionFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputTranscription"},
          transcriptionFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerContentFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modelTurn"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelTurn"},
          contentFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"modelTurn"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"interrupted"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"interrupted"},
          Common.getValueByPath(fromObject, new String[] {"interrupted"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"groundingMetadata"},
          Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationComplete"},
          Common.getValueByPath(fromObject, new String[] {"generationComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputTranscription"},
          transcriptionFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputTranscription"},
          transcriptionFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode functionCallFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"args"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"args"},
          Common.getValueByPath(fromObject, new String[] {"args"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode functionCallFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"args"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"args"},
          Common.getValueByPath(fromObject, new String[] {"args"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerToolCallFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCalls"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionCalls"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                functionCallFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionCalls"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerToolCallFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCalls"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionCalls"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                functionCallFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionCalls"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerToolCallCancellationFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"ids"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"ids"}, Common.getValueByPath(fromObject, new String[] {"ids"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerToolCallCancellationFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"ids"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"ids"}, Common.getValueByPath(fromObject, new String[] {"ids"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode modalityTokenCountFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modality"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modality"},
          Common.getValueByPath(fromObject, new String[] {"modality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"tokenCount"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode modalityTokenCountFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modality"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modality"},
          Common.getValueByPath(fromObject, new String[] {"modality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"tokenCount"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode usageMetadataFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"cachedContentTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"responseTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolUsePromptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thoughtsTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"totalTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"promptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"cacheTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"responseTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"responseTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode)
              Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"toolUsePromptTokensDetails"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode usageMetadataFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"cachedContentTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidatesTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"candidatesTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolUsePromptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thoughtsTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"totalTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"promptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"cacheTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidatesTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"candidatesTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"responseTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode)
              Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                modalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"toolUsePromptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"trafficType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"trafficType"},
          Common.getValueByPath(fromObject, new String[] {"trafficType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerGoAwayFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"timeLeft"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"timeLeft"},
          Common.getValueByPath(fromObject, new String[] {"timeLeft"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerGoAwayFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"timeLeft"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"timeLeft"},
          Common.getValueByPath(fromObject, new String[] {"timeLeft"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerSessionResumptionUpdateFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"newHandle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"newHandle"},
          Common.getValueByPath(fromObject, new String[] {"newHandle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"resumable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"resumable"},
          Common.getValueByPath(fromObject, new String[] {"resumable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"lastConsumedClientMessageIndex"},
          Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerSessionResumptionUpdateFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"newHandle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"newHandle"},
          Common.getValueByPath(fromObject, new String[] {"newHandle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"resumable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"resumable"},
          Common.getValueByPath(fromObject, new String[] {"resumable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"lastConsumedClientMessageIndex"},
          Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerMessageFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setupComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setupComplete"},
          liveServerSetupCompleteFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setupComplete"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"serverContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"serverContent"},
          liveServerContentFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"serverContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCall"},
          liveServerToolCallFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCall"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCallCancellation"},
          liveServerToolCallCancellationFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          usageMetadataFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"usageMetadata"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode liveServerMessageFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setupComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setupComplete"},
          liveServerSetupCompleteFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setupComplete"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"serverContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"serverContent"},
          liveServerContentFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"serverContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCall"},
          liveServerToolCallFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCall"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCallCancellation"},
          liveServerToolCallCancellationFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          usageMetadataFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"usageMetadata"})),
              toObject));
    }

    return toObject;
  }
}
