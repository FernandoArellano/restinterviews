package org.fer.data;

public class Message {

    private String id;
    private String description;

    public Message(){}

    public Message(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
