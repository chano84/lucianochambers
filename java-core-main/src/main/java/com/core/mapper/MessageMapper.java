package com.core.mapper;

import com.core.model.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

    void create(Message message);

}
