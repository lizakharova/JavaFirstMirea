package ru.mirea.task2.book;

public class BookTest{
    public static void main(String[] args) {
        Book d1 = new Book("Britt-Marie was here", 7, 512);
        Book d2 = new Book("Witcher. Game that never was", 28, 492);
        Book d3 = new Book("Dandelion wine");
        d3.setAge(64);
        d3.setThickness(379);
        System.out.println(d1);
        d1.intoMonth();
        d2.intoMonth();
        d3.intoMonth();
    }
}