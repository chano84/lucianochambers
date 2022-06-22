package com.core.model;

public class Message {

    private final Long id;
    private final Contact from;
    private final Contact to;
    private final String content;

    public Message(Long id, Contact from, Contact to, String content) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public Contact getFrom() {
        return from;
    }

    public Long getId() {
        return id;
    }

    public Contact getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }


}
