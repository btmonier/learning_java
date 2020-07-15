package com.btmonier;

public class Paper {
    private String paperType;
    private String color;
    private Dimensions dimensions;
    private int porosity;
    private String composition;

    public Paper(String paperType, String color, Dimensions dimensions, int porosity, String composition) {
        this.paperType = paperType;
        this.color = color;
        this.dimensions = dimensions;
        this.porosity = porosity;
        this.composition = composition;
    }

    public void makeOrigami(String creature) {
        System.out.println("You fold the paper many times. This " + creature + " paper creation will be great.");
    }

    public String getPaperType() {
        return paperType;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getPorosity() {
        return porosity;
    }

    public String getComposition() {
        return composition;
    }
}
