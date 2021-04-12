package br.com.oatsolutions.gof.classscope.creational.factorymethod;
public abstract class HamburgerStore {
    public Hamburger orderHamburger(String type){
        Hamburger burger;

        burger = createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String type);

}
