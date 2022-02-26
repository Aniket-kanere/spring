package com.akhilesh.mail.di.consumer;

import com.akhilesh.mail.di.service.MessageService;

public class ConsumerImpl implements Consumer {

    MessageService messageService;

    public ConsumerImpl(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message,receiver);
    }
}
