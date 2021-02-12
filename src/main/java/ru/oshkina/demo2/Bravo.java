package ru.oshkina.demo2;

public class Bravo implements Calculator {

    @Override
    public int calc(int n) {
        //Вычисление факториала числа
        if (n < 1) {
            return 1;
        } else {
            return n * calc(n - 1);
        }
    }
}
