package com.Satria.Pemrograman2.ChallengePertemuan4;

public class Item {

    String name;
    int price;

    public Item() {
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void Itemname(){
        System.out.println("Item acquired " + name);
    }

    public void showInfo(){
        System.out.println("Item name: " + name);
        System.out.println("Item price: " + price);

        extraInfo();
    }
    public void extraInfo() {};


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
