package com.example.layoutdemo;

// FruitPlus class contains fruitImage and fruitName
// With automatically generated Setter and Getter
public class FruitPlus {

    // store the resource ID of fruit image
    private int fruitImage;

    // store the string representing the fruit name
    private String fruitName;

    private double fruitPrice;

    public FruitPlus(int fruitImage, String fruitName, double fruitPrice) {
        this.fruitImage = fruitImage;
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
    }

    public int getFruitImage() {
        return fruitImage;
    }

    public void setFruitImage(int fruitImage) {
        this.fruitImage = fruitImage;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFruitPrice() { return fruitPrice;}

    public void setFruitPrice(double fruitPrice) { this.fruitPrice = fruitPrice; }

}
