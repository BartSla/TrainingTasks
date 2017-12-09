package com.avebart;

public class Desk {

    private String size;
    private String color;
    private int legs;

    public Desk(String size, String color, int legs) {
        this.size = size;
        this.color = color;
        this.legs = legs;
    }

    public void openDesk (String isOpen){

        System.out.println(isOpen);
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }
}
