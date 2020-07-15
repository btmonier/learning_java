package com.btmonier;

public class Room {
    private Book book;
    private Cup cup;
    private Paper paper;

    public Room(Book book, Cup cup, Paper paper) {
        this.book = book;
        this.cup = cup;
        this.paper = paper;
    }

    public void relaxInRoom(String liquid, int pageNumber, String creature) {
        sitDown();
        cup.pourIntoCup(liquid);
        book.openBook(pageNumber);
        paper.makeOrigami(creature);
    }
    private void sitDown() {
        System.out.println("You find a chair in the room. You sit down.");
    }

    public Book getBook() {
        return this.book;
    }

    public Cup getCup() {
        return this.cup;
    }

    public Paper getPaper() {
        return this.paper;
    }
}
