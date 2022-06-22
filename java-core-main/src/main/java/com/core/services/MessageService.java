package com.core.services;

import com.core.dao.MessageDAO;
import com.core.model.Contact;
import com.core.model.Message;
import com.core.model.Notification;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageDAO messageDAO;
    private final NotificationService notificationService;

    public MessageService(MessageDAO messageDAO, MessageDAO messageDAO1, NotificationService notificationService){
        this.messageDAO = messageDAO1;
        this.notificationService = notificationService;
    }

    public void send(Message message){
        messageDAO.create(message);
        message.getTo().getContacts().forEach( contact -> this.notifyMessage(contact, message));
    }

    private Notification notifyMessage(Contact contact, Message message) {
        return this.notificationService.notify(contact, message);
    }

}
