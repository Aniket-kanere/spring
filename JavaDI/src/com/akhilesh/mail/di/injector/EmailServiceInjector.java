package com.akhilesh.mail.di.injector;

import com.akhilesh.mail.di.consumer.Consumer;
import com.akhilesh.mail.di.consumer.ConsumerImpl;
import com.akhilesh.mail.di.service.EmailServiceImpl;

public class EmailServiceInjector implements  MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new ConsumerImpl(new EmailServiceImpl());
    }
}
