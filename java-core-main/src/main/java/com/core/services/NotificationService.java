package com.core.services;

import com.core.dao.NotificationDAO;
import com.core.model.Contact;
import com.core.model.Message;
import com.core.model.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationDAO notificationDAO;

    public NotificationService( NotificationDAO notificationDAO){
        this.notificationDAO= notificationDAO;
    }

    public Notification notify(Contact contact, Message message) {
        Notification notification = new Notification(contact, message);
        return this.notificationDAO.create(notification);
    }
}
