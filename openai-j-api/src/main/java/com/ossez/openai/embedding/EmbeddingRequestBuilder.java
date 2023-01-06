package com.ossez.openai.embedding;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class EmbeddingRequestBuilder {
    private String model;
    private @NonNull List<String> input;
    private String user;

    public EmbeddingRequestBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public EmbeddingRequestBuilder setInput(@NonNull List<String> input) {
        this.input = input;
        return this;
    }

    public EmbeddingRequestBuilder setUser(String user) {
        this.user = user;
        return this;
    }

    public EmbeddingRequest createEmbeddingRequest() {
        return new EmbeddingRequest(model, input, user);
    }
}