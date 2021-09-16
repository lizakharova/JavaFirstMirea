package ru.mirea.task3;

class Corgi extends Dog {
    private String massa;
    public Corgi(String name, String age, String color, String massa){
        super(name, age, color);
        this.massa = massa;
    }
    public String getMassa() {return massa;}
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Количество лет: " + super.getAge());
        System.out.println("Вес: " + massa + "и цвет собаки: " + super.getColor());
    }
}