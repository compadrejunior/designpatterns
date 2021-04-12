package br.com.oatsolutions.gof.classscope.creational.factorymethod;

public class TraditionalStore extends HamburgerStore{

    @Override
    public Hamburger createHamburger(String type) {
        Hamburger burger;
        if (type.equals("cheese")) {
            burger = new TraditionalCheeseBurger();
        } else {
            burger = new TraditionalBurger();
        }
        return burger;
    }
}
