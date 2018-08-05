package com.quejboard.messaging.springbootactivemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "quej.queue")
    public void listener(String message) {
        System.out.println("I HAVE Received Message : " + message);

    }
}
