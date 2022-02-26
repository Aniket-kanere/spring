package com.akhilesh.mail.withoutdi;

public class TestEmailService {
    public static void main(String args[]){

      MyApplication myApplication = new MyApplication();
      myApplication.processEmail("Hello", "akhileapande@gmail.com");
    }
}
