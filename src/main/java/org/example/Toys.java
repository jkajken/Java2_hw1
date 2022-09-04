package org.example;
public class Toys {
    private String name;
    private int price;
    private ToyShop toyShop;
    private ToyCategories toyCategories;

    public Toys(String name, int price, ToyShop toyShop, ToyCategories toyCategories) {
        this.name = name;
        this.price = price;
        this.toyShop = toyShop;
        this.toyCategories = toyCategories;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ToyShop getToyShop() {
        return toyShop;
    }

    public ToyCategories getToyCategories() {
        return toyCategories;
    }
}
