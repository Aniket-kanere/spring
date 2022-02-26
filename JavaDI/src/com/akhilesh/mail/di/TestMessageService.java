package com.akhilesh.mail.di;

import com.akhilesh.mail.di.consumer.Consumer;
import com.akhilesh.mail.di.injector.EmailServiceInjector;
import com.akhilesh.mail.di.injector.MessageServiceInjector;
import com.akhilesh.mail.di.injector.SMSServieInjector;

public class TestMessageService {

    public static void main(String args[]){
        Consumer consumer= null;
        MessageServiceInjector messageServiceInjector = new EmailServiceInjector();
        consumer =messageServiceInjector.getConsumer();
        consumer.processMessage("Hello Akhilesh", "akhilespande@gmail.com");

        messageServiceInjector = new SMSServieInjector();
        consumer= messageServiceInjector.getConsumer();
        consumer.processMessage("Hello Akhilesh", "999999999");

    }
}
