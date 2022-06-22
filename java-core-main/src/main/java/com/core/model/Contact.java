package com.core.model;

import java.util.List;

public class Contact {

    private final Long id;
    private final String name;
    private final List<Contact> contacts;
    private final Boolean isGroup;

    public Contact(Long id, String name, List<Contact> contacts, Boolean isGroup) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;
        this.isGroup = isGroup;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Boolean getGroup() {
        return isGroup;
    }

}
