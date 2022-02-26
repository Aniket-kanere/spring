package com.akhilesh.mail.di.service;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sending SMS to : "+receiver + " with Message :"+ message);
    }
}
