package com.example.demo2;

public class Pizza {
    public Pizza(int newSize, String newType, boolean newSpicyOrNot) {
        size = newSize;
        type = newType;
        spicyOrNot = newSpicyOrNot;
    }

    private int size;
    private String type;
    private boolean spicyOrNot;

    public Pizza() {}

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public boolean getIsSpicyOrNot() {
        return spicyOrNot;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpiceOrNot(boolean spicyOrNot) {
        this.spicyOrNot = spicyOrNot;
    }

    public String toString() {
        return "Your Order:\n" + "type of pizza: " + type + "\nsize: " + size + "\n" + "spicy: " + spicyOrNot;
    }

}
