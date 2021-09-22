package ru.mirea.task6.price;

class Wine implements Priceable {
    private String name;
    private int year;
    private int price;

    Wine(String name, int year, int price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Вино " + name + " " + year + " года. Стоит: " + price + "Р");
    }
}
