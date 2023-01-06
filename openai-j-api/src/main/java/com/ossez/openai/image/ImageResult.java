package com.ossez.openai.image;


import java.util.List;

/**
 * An object with a list of image results.
 *
 * https://beta.openai.com/docs/api-reference/images
 */

public class ImageResult {

    /**
     * The creation time in epoch seconds.
     */
    Long createdAt;

    /**
     * List of image results.
     */
    List<Image> data;

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public List<Image> getData() {
        return data;
    }

    public void setData(List<Image> data) {
        this.data = data;
    }
}
