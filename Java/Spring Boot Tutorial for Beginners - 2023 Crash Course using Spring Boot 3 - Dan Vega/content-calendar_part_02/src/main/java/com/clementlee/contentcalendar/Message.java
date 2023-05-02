package com.clementlee.contentcalendar;

import org.springframework.stereotype.Component;

// "@Component" is class-level annotation
// "@Component" indicate "Message" class is a Spring-managed component (included in Application Context)
@Component
public class Message {

    public String getMessage(){
        return "Hello World";
    }
}
