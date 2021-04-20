package br.com.oatsolutions.gof.objectscope.behavioral.observer;

/**
 * File: Subject
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:09
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    Object getUpdate();
}
