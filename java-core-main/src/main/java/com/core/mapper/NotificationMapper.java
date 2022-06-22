package com.core.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NotificationMapper {

    void create(Long contactId, Long messageId);
}
