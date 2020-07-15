package com.btmonier;

public class Cup {
    private int volume;
    private String color;
    private boolean hasHandle;

    public Cup(int volume, String color, boolean hasHandle) {
        this.volume = volume;
        this.color = color;
        this.hasHandle = hasHandle;
    }

    public void pourIntoCup(String liquid) {
        System.out.println("You poor the liquid " + liquid + " into the cup. Hopefully it tastes good.");
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }
}
