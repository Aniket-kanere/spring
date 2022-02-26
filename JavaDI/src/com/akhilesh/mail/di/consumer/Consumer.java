package com.akhilesh.mail.di.consumer;

public interface Consumer {

    void processMessage(String message, String receiver);
}
