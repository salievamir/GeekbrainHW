package com.geekbrains;

public class Main {

    public static int a = 10, b = -10;
    public static void main(String[] args) {

        checkSum();
        inteGer();
        rev();
        hwDone();
        leapYear();

    }

    public static void checkSum() { //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        if((a+b) >= 10&&(a+b) <= 20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void inteGer() { //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        if(a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    public static void rev() { //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        if(b >= 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }

    public static void hwDone() { //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз.
        String string = "Success";
        int n = 5;
        for(int i = n; i >= 0; i--){
            System.out.println(string);
        }
    }

    public static void leapYear() { //Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        int year = 2100;
        boolean bool = false;
        if (year % 4 == 0 && (year / 100) % 4 == 0) {
            bool = true;
        } else {
            bool = false;
        }
        System.out.println(bool);
    }
}
