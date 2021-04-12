package br.com.oatsolutions.gof.classscope.creational.factorymethod;

public class GourmetStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        Hamburger burger;
        if (type.equals("veggie")) {
            burger = new VeggieBurger();
        } else {
            burger = new GourmetBurger();
        }
        return burger;
    }
}
