package br.com.oatsolutions.gof.objectscope.behavioral.strategy;

public class Product {
    private final int price;
    private final String upcCode;

    public Product(String upcCode, int price) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }
}
