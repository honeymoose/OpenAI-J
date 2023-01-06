package com.theokanning.openai.finetune;



/**
 * Fine-tuning job hyperparameters
 *
 * https://beta.openai.com/docs/api-reference/fine-tunes
 */

public class HyperParameters {

    /**
     * The batch size to use for training.
     */
    String batchSize;

    /**
     * The learning rate multiplier to use for training.
     */
    Double learningRateMultiplier;

    /**
     * The number of epochs to train the model for.
     */
    Integer nEpochs;

    /**
     * The weight to use for loss on the prompt tokens.
     */
    Double promptLossWeight;

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }

    public Double getLearningRateMultiplier() {
        return learningRateMultiplier;
    }

    public void setLearningRateMultiplier(Double learningRateMultiplier) {
        this.learningRateMultiplier = learningRateMultiplier;
    }

    public Integer getnEpochs() {
        return nEpochs;
    }

    public void setnEpochs(Integer nEpochs) {
        this.nEpochs = nEpochs;
    }

    public Double getPromptLossWeight() {
        return promptLossWeight;
    }

    public void setPromptLossWeight(Double promptLossWeight) {
        this.promptLossWeight = promptLossWeight;
    }
}
