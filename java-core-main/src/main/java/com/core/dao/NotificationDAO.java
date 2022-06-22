package com.core.dao;

import com.core.mapper.NotificationMapper;

import com.core.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationDAO {

    @Autowired
    NotificationMapper notificationMapper;

    public Notification create(Notification notification) {
        this.notificationMapper.create( notification.getContact().getId(), notification.getMessage().getId() );
        return notification;
    }
}
