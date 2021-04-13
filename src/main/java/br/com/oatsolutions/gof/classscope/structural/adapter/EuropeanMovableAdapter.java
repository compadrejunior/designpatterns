package br.com.oatsolutions.gof.classscope.structural.adapter;

/**
 * File: EuropeanMovableAdapter
 * Project: DesignPatterns
 * File Created: 13/04/2021 16:56
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class EuropeanMovableAdapter implements MovableAdapter {
    private Movable luxuryCars;

    // standard constructors

    public EuropeanMovableAdapter(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(this.luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
