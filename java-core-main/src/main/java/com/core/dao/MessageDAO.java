package com.core.dao;

import com.core.mapper.MessageMapper;
import com.core.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAO {

  @Autowired
  MessageMapper messageMapper;

  public Message create(Message message){
        this.messageMapper.create(message);
        return message;
   }

}
