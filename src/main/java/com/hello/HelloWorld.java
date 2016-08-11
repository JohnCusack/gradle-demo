package com.hello;

import org.apache.log4j.Logger;

/**
 * Created by Nico on 8/11/16 11:13.
 */
public class HelloWorld {

    private static final Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
        logger.info("Received message: " + message);
    }
}
