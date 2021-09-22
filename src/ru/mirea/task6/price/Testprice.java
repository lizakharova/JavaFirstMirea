package ru.mirea.task6.price;

public class Testprice {
    public static void main(String[] args) {
        Priceable p1 = (Priceable) new Phone("iPhone", 2020, 110990);
        Priceable w1 = (Priceable) new Wine("Romanee Cont", 1945, 4000000);
        p1.getPrice();
        w1.getPrice();
    }
}
