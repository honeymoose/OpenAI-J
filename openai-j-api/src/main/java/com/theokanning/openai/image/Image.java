package com.theokanning.openai.image;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing either a URL or a base 64 encoded image.
 *
 * https://beta.openai.com/docs/api-reference/images
 */

public class Image {
    /**
     * The URL where the image can be accessed.
     */
    String url;


    /**
     * Base64 encoded image string.
     */
    @JsonProperty("b64_json")
    String b64Json;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getB64Json() {
        return b64Json;
    }

    public void setB64Json(String b64Json) {
        this.b64Json = b64Json;
    }
}
