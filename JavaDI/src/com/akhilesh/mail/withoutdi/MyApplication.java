package com.akhilesh.mail.withoutdi;

public class MyApplication {

    private  EmailService emailService = new EmailService();

    public void processEmail( String message, String receiver){

        this.emailService.sendEmail(message,receiver);
    }

}
