package com.ossez.openai;

import com.ossez.openai.completion.CompletionChoice;
import com.ossez.openai.completion.CompletionRequest;
import com.ossez.openai.completion.CompletionRequestBuilder;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CompletionTest {

    String token = System.getenv("OPENAI_TOKEN");
    OpenAiService service = new OpenAiService(token);

    @Test
    void createCompletion() {
        CompletionRequest completionRequest = new CompletionRequestBuilder()
                .setModel("ada")
                .setPrompt("Somebody once told me the world is gonna roll me")
                .setEcho(true)
                .setN(5)
                .setMaxTokens(50)
                .setUser("testing")
                .setLogitBias(new HashMap<>())
                .createCompletionRequest();

        List<CompletionChoice> choices = service.createCompletion(completionRequest).getChoices();
        assertEquals(5, choices.size());
    }

    @Test
    void createCompletionDeprecated() {
        CompletionRequest completionRequest = new CompletionRequestBuilder()
                .setPrompt("Somebody once told me the world is gonna roll me")
                .setEcho(true)
                .setUser("testing")
                .createCompletionRequest();

        List<CompletionChoice> choices = service.createCompletion("ada", completionRequest).getChoices();
        assertFalse(choices.isEmpty());
    }
}
