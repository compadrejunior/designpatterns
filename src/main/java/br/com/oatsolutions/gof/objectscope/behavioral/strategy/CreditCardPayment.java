package br.com.oatsolutions.gof.objectscope.behavioral.strategy;

/**
 * File: CreditCardPayment
 * Project: DesignPatterns
 * File Created: 13/04/2021 11:43
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class CreditCardPayment implements Payment{
    private final String name;
    private final String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

}
