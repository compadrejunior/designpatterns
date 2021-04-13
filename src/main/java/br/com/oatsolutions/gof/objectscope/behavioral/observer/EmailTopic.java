package br.com.oatsolutions.gof.objectscope.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * File: EmailTopic
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:14
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class EmailTopic implements Subject {
    private List<Observer> observerList;
    private String message;

    public EmailTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object");
        if (!observerList.contains(observer)) observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate() {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        notifyObservers();
    }
}
