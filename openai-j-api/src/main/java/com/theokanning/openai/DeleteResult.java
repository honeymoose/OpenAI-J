package com.theokanning.openai;



/**
 * A response when deleting an object
 */

public class DeleteResult {
    /**
     * The id of the object.
     */
    String id;

    /**
     * The type of object deleted, for example "file" or "model"
     */
    String object;

    /**
     * True if successfully deleted
     */
    boolean deleted;

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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
