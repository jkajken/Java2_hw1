package org.example;

import java.util.Arrays;

public class Dolls extends Toys {
    private String toyBenefits;
    private String[] movement;
    private Material material;

    public Dolls(String name, int price, ToyShop toyShop, ToyCategories toyCategories,
                 String toyBenefits, String[] movement, Material material) {
        super(name, price, toyShop, toyCategories);
        this.toyBenefits = toyBenefits;
        this.movement = movement;
        this.material = material;
    }

    public String getToyBenefits() {
        return toyBenefits;
    }

    public String[] getMovement() {
        return movement;
    }

    public Material getMaterial() {
        return material;
    }
    final public void makeVoice(){
        System.out.println("Mama");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public String getInfo(){
        return "Name: "+ getName()+
                "\nPrice: "+ getPrice()+
                "\nToy shop name : " + getToyShop().getMallName()+
                "\nMall address : "+ getToyShop().getAddress()+
                "\nToy Categories: "+ getToyCategories()+
                "\nToy Benefits: "+ getToyBenefits()+
                "\nMovements toy can do: "+ Arrays.toString(movement)+
                "]\nMaterial  toy made of: "+ getMaterial();

    }
}