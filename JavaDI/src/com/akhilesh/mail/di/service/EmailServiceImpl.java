package com.akhilesh.mail.di.service;

public class EmailServiceImpl implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Message send to "+ receiver + " with Message : "+ message);
    }
}
