package br.com.oatsolutions.gof.objectscope.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * File: ShoppingCart
 * Project: DesignPatterns
 * File Created: 13/04/2021 11:21
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment payment) {
        int amount = calculateTotal();
        payment.pay(amount);
    }

}
