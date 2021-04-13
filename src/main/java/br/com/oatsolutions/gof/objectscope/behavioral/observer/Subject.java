package br.com.oatsolutions.gof.objectscope.behavioral.observer;

/**
 * File: Subject
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:09
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate();
}
