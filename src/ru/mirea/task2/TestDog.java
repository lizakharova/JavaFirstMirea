package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args){
        Pug shp = new Pug("Valeriy", "12", "creamy", "face black spot");
        shp.displayInfo();
        Corgi shc = new Corgi("Oxana", "4", "orange and white", "13");
        shc.displayInfo();
    }
}
