package br.com.oatsolutions.gof.objectscope.behavioral.strategy;

/**
 * File: PaypalPayment
 * Project: DesignPatterns
 * File Created: 13/04/2021 11:47
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class PaypalPayment implements Payment {

    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
