package com.ossez.openai.completion;

import java.util.List;
import java.util.Map;

public class CompletionRequestBuilder {
    private String model;
    private String prompt;
    private Integer maxTokens;
    private Double temperature;
    private Double topP;
    private Integer n;
    private Boolean stream;
    private Integer logprobs;
    private Boolean echo;
    private List<String> stop;
    private Double presencePenalty;
    private Double frequencyPenalty;
    private Integer bestOf;
    private Map<String, Integer> logitBias;
    private String user;

    public CompletionRequestBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CompletionRequestBuilder setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public CompletionRequestBuilder setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    public CompletionRequestBuilder setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public CompletionRequestBuilder setTopP(Double topP) {
        this.topP = topP;
        return this;
    }

    public CompletionRequestBuilder setN(Integer n) {
        this.n = n;
        return this;
    }

    public CompletionRequestBuilder setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    public CompletionRequestBuilder setLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    public CompletionRequestBuilder setEcho(Boolean echo) {
        this.echo = echo;
        return this;
    }

    public CompletionRequestBuilder setStop(List<String> stop) {
        this.stop = stop;
        return this;
    }

    public CompletionRequestBuilder setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    public CompletionRequestBuilder setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    public CompletionRequestBuilder setBestOf(Integer bestOf) {
        this.bestOf = bestOf;
        return this;
    }

    public CompletionRequestBuilder setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
        return this;
    }

    public CompletionRequestBuilder setUser(String user) {
        this.user = user;
        return this;
    }

    public CompletionRequest createCompletionRequest() {
        return new CompletionRequest(model, prompt, maxTokens, temperature, topP, n, stream, logprobs, echo, stop, presencePenalty, frequencyPenalty, bestOf, logitBias, user);
    }
}