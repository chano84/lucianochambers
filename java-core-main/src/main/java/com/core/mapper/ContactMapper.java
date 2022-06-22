package com.core.mapper;

import com.core.model.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContactMapper {

    List<Contact> getContactsOfGroup(Long id);

}
