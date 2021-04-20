package br.com.oatsolutions.gof.objectscope.behavioral.observer;

/**
 * File: EmailTopicSubscriber
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:26
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class EmailTopicSubscriber implements Observer {
    private final String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate();
        if (message == null)
            System.out.println(name + ": No new message on " +
                "this topic.");
        else
            System.out.println(name + " Retrieving message: " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
