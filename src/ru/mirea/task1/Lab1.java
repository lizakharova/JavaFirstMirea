package ru.mirea.task1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Sum = 0;
        System.out.print("Введите длину массива: ");
        int a = scan.nextInt();
        System.out.print("Введите элементы массива: ");
        int[] b = new int[a];
        for(int i=0; i<a; i++){
            b[i] = scan.nextInt();
            Sum = Sum + b[i];
        }
        System.out.print("Сумма элементов массива: ");
        System.out.print(Sum);
    }
}
