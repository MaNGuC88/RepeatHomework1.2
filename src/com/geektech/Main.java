package com.geektech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника в метрах");

        int length = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);

        System.out.println("Теперь введите его ширину, так же в метрах");

        int width = scan3.nextInt();

        int square = (length * width);

        System.out.println("Площадь Вашего прямоугольника равна " + square + " метрам!");


    }
}
