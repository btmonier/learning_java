package com.btmonier;


public class Book {
    private String title;
    private String genre;
    private int numberOfPages;
    private Dimensions dimensions;

    public Book(String title, int numberOfPages, String genre, Dimensions dimensions) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.dimensions = dimensions;
    }

    public void openBook(int pageNumber) {
        System.out.println("You have turned to page " + pageNumber + " what will await you on this reading adventure.");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
