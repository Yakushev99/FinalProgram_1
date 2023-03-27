package ru.ibs.finalprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rub = input.nextDouble();

        System.out.printf("Итого: %.2f долларов",rub/exchangeRate);
    }
}
