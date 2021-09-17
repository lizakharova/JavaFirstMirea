package ru.mirea.task2;

class Pug extends Dog {
    private String printt;
    public Pug(String name, String age, String color, String printt){
        super(name, age, color);
        this.printt = printt;
    }
    public String getPrintt() {return printt;}
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Количество лет: " + super.getAge());
        System.out.println("Принт: " + printt + "и цвет собаки: " + super.getColor());
    }
}
