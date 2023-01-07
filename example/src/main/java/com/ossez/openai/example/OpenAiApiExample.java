package com.ossez.openai.example;

import com.ossez.openai.OpenAiService;
import com.ossez.openai.completion.CompletionRequest;
import com.ossez.openai.completion.CompletionRequestBuilder;

/**
 * Test Object for ChatGPT OpenAI
 */
public class OpenAiApiExample {
    public static void main(String... args) {
        String token = "sk-****************************************";
        OpenAiService service = new OpenAiService(token);

        System.out.println("\nCreating completion...");
        CompletionRequest completionRequest = new CompletionRequestBuilder()
                .setModel("text-davinci-003")
                .setPrompt("长沙机场")
                .setMaxTokens(700)
                .setEcho(true)
                .createCompletionRequest();

        System.out.println(service.createCompletion(completionRequest).getChoices().get(0).getText());
    }
}
