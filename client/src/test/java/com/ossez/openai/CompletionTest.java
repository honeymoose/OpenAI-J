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

    String token = "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"; //System.getenv("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");
    OpenAiService service = new OpenAiService(token);

    @Test
    void createCompletion() {
        CompletionRequest completionRequest = new CompletionRequestBuilder()
                .setModel("text-davinci-003")
                .setPrompt("讲一个关于程序员的笑话")
                .setEcho(true)
//                .setN(0)
                .setMaxTokens(500)
                .setUser("testing")
                .setLogitBias(new HashMap<>())
                .createCompletionRequest();

        List<CompletionChoice> choices = service.createCompletion(completionRequest).getChoices();
        System.out.println(choices.get(0).getText());
//        System.out.println(choices.get(1).getText());
//        assertEquals(5, choices.get(0).getText());
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
