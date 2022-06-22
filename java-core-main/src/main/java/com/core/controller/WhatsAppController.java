package com.core.controller;


import com.core.mapper.exceptions.ServiceException;
import com.core.model.Contact;
import com.core.model.Message;
import com.core.services.MessageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WhatsAppController {

    private final  MessageService messageService;

    public WhatsAppController(MessageService messageService) {
        this.messageService = messageService;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/message", method = RequestMethod.POST)
    @ResponseBody
    public Object sendMessage(@RequestBody Message message) throws ServiceException {
        this.messageService.send(message);
        return null;
    }

}
