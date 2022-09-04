package org.example;

import java.awt.*;

final public class Cars extends Dolls {
    private Color toyColor;

    public Cars(String name, int price, ToyShop toyShop, ToyCategories toyCategories,
                String toyBenefits, String[] movement, Material material, Color toyColor) {
        super(name, price, toyShop, toyCategories, toyBenefits, movement, material);
        this.toyColor = toyColor;
    }

    public Color getToyColor() {
        return toyColor;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nToy Color: "+getToyColor();
    }
}
