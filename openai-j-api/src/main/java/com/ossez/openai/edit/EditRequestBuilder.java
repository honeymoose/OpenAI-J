package com.ossez.openai.edit;

import org.checkerframework.checker.nullness.qual.NonNull;

public class EditRequestBuilder {
    private String model;
    private String input;
    private @NonNull String instruction;
    private Integer n;
    private Double temperature;
    private Double topP;

    public EditRequestBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public EditRequestBuilder setInput(String input) {
        this.input = input;
        return this;
    }

    public EditRequestBuilder setInstruction(@NonNull String instruction) {
        this.instruction = instruction;
        return this;
    }

    public EditRequestBuilder setN(Integer n) {
        this.n = n;
        return this;
    }

    public EditRequestBuilder setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public EditRequestBuilder setTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    public EditRequest createEditRequest() {
        return new EditRequest(model, input, instruction, n, temperature, topP);
    }
}