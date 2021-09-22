package ru.mirea.task4.ball;

public class Testball {
    public static void main(String[] args)
    {
        Ball c = new Ball(6, 5);
        System.out.println(c);
        c.move(2, 3);
        System.out.println(c);
    }
}