package com.theokanning.openai.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Given a prompt and an instruction, OpenAi will return an edited version of the prompt
 *
 * https://beta.openai.com/docs/api-reference/edits/create
 */

public class EditRequest {

    /**
     * The name of the model to use.
     * Required if using the new v1/edits endpoint.
     */
    String model;

    /**
     * The input text to use as a starting point for the edit.
     */
    String input;

    /**
     * The instruction that tells the model how to edit the prompt.
     * For example, "Fix the spelling mistakes"
     */
    @NonNull
    String instruction;

    /**
     * How many edits to generate for the input and instruction.
     */
    Integer n;

    /**
     * What sampling temperature to use. Higher values means the model will take more risks.
     * Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
     *
     * We generally recommend altering this or {@link EditRequest#topP} but not both.
     */
    Double temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of
     * the tokens with top_p probability mass.So 0.1 means only the tokens comprising the top 10% probability mass are
     * considered.
     *
     * We generally recommend altering this or {@link EditRequest#temperature} but not both.
     */
    @JsonProperty("top_p")
    Double topP;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }
}
