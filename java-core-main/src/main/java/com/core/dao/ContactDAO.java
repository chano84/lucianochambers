package com.core.dao;

import com.core.mapper.ContactMapper;
import com.core.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDAO {

    @Autowired
    ContactMapper mapper;

    public List<Contact> getContactOfGroup(Long id){
        return this.mapper.getContactsOfGroup(id);
    }


}
