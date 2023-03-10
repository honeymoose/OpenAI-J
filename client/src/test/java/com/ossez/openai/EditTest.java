package com.ossez.openai;

import com.ossez.openai.edit.EditRequest;
import com.ossez.openai.edit.EditRequestBuilder;
import com.ossez.openai.edit.EditResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EditTest {
    String token = System.getenv("OPENAI_TOKEN");
    OpenAiService service = new OpenAiService(token);

    @Test
    void edit() {
        EditRequest request = new EditRequestBuilder()
                .setModel("text-davinci-edit-001")
                .setInput("What day of the wek is it?")
                .setInstruction("Fix the spelling mistakes")
                .createEditRequest();

        EditResult result = service.createEdit( request);
        System.out.println(result.getChoices().get(0).getText());

        assertNotNull(result.getChoices().get(0).getText());
    }

    @Test
    void editDeprecated() {
        EditRequest request = new EditRequestBuilder()
                .setInput("What day of the wek is it?")
                .setInstruction("Fix the spelling mistakes")
                .createEditRequest();

        EditResult result = service.createEdit("text-davinci-edit-001", request);

        assertNotNull(result.getChoices().get(0).getText());
    }
}
