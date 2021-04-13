package br.com.oatsolutions.gof;

import br.com.oatsolutions.gof.objectscope.behavioral.observer.EmailTopic;
import br.com.oatsolutions.gof.objectscope.behavioral.observer.EmailTopicSubscriber;
import br.com.oatsolutions.gof.objectscope.behavioral.observer.Observer;

/**
 * File: Main
 * Project: DesignPatterns
 * File Created: 13/04/2021 15:41
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        // Observer Test
        EmailTopic topic = new EmailTopic();

        // Creating observers
        Observer firstObserver =
                new EmailTopicSubscriber("FirstObserver");

        Observer secondObserver =
                new EmailTopicSubscriber("SecondObserver");

        Observer thirdObserver =
                new EmailTopicSubscriber("ThirdObserver");

        // Register observer
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attach observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // Check for update
        firstObserver.update();

        // Provider / Subject (broadcaster)
        topic.postMessage("Hello Subscribers");
    }
}
