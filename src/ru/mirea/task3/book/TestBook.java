package ru.mirea.task3.book;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Britt-Marie was here", 2014, "Fredrik Backman");
        Book d2 = new Book("Witcher. Game that never was", 1993, "Andrzej Sapkowski");
        Book d3 = new Book("Dandelion wine", 1957, "Ray Bradbury");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
