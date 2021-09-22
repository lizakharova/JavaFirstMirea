package ru.mirea.task6.price;

class Phone implements Priceable {
    private String name;
    private int year;
    private int price;

    Phone(String name, int year, int price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Телефон " + name + " " + year + " года. Стоит: " + price + "р");
    }
}
