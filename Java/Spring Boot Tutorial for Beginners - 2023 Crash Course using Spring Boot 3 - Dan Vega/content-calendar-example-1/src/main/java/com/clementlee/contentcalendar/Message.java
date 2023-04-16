package com.clementlee.contentcalendar;

import org.springframework.stereotype.Component;
@Component // indicate "Message" class is a Spring-managed component (included in Application Context)
public class Message {

    public String getMessage(){
        return "Hello World";
    }
}
