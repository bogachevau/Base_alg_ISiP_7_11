package org.example;

public class Main {
    public static void main(String[] args) {
        int temperature = -3;
        if (temperature > 0) {
            System.out.println("На улице сейчас прохладно");
        } else {
            System.out.println("На улице мороз");
        }

        positiveNumber(5);
        positiveNumber(0);
        positiveNumber(-9);

        int a = 10;
        if (a >= 0 && a <= 20) {
            System.out.println("В переменной а лежит число от 0 до 20");
        }

        int b = 5;
        if (b == 5 || b == 10) {
            System.out.println("В переменной b лежит число 5 или 10");
        }

        int c = 50;
        if (!(c >= 0 && c <= 20)) {
            System.out.println("Значение переменной c не должно лежать " +
                    "в диапазоне от 0 до 20");
        }

        System.out.println(calc(a, b, c, 6, 4));
    }

    static void positiveNumber(int number) {
        if (number > 0) {
            System.out.println("Положительное число");
        } else if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Ноль");
        }
    }

    static double calc(int a, int b, int c, int d, int e) {
        return Math.sqrt(a * (b + c)) / Math.pow((d + e), 2);
    }
}