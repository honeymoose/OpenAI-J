package com.ossez.openai;


/**
 * The OpenAI resources used by a request
 */

public class Usage {
    /**
     * The number of prompt tokens used.
     */
    long promptTokens;

    /**
     * The number of completion tokens used.
     */
    long completionTokens;

    /**
     * The number of total tokens used
     */
    long totalTokens;

    public long getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(long promptTokens) {
        this.promptTokens = promptTokens;
    }

    public long getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(long completionTokens) {
        this.completionTokens = completionTokens;
    }

    public long getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(long totalTokens) {
        this.totalTokens = totalTokens;
    }
}
