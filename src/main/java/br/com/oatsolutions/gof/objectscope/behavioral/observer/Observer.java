package br.com.oatsolutions.gof.objectscope.behavioral.observer;

/**
 * File: Observer
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:12
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public interface Observer {
    void update();
    void setSubject(Subject subject);
}
