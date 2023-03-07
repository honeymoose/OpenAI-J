package com.ossez.openai.engine;


/**
 * GPT-3 engine details
 *
 * https://beta.openai.com/docs/api-reference/retrieve-engine
 */
@Deprecated


public class Engine {
    /**
     * An identifier for this engine, used to specify an engine for completions or searching.
     */
    public String id;

    /**
     * The type of object returned, should be "engine"
     */
    public String object;

    /**
     * The owner of the GPT-3 engine, typically "openai"
     */
    public String owner;

    /**
     * Whether the engine is ready to process requests or not
     */
    public boolean ready;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
