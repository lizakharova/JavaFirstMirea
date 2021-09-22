package ru.mirea.task5.dog;

public abstract class Dog {
    private String name;
    private String age;
    private String color;
    public String getName() {return name;}
    public String getAge() {return age;}
    public String getColor() {return color;}
    public Dog(String name, String age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public abstract void displayInfo();
}
