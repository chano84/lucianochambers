package com.core.model;

public class Notification {

    private final Contact contact;
    private final Message message;

    public Notification(Contact contact, Message message) {
        this.contact = contact;
        this.message = message;
    }

    public Contact getContact() {
        return contact;
    }

    public Message getMessage() {
        return message;
    }

}
