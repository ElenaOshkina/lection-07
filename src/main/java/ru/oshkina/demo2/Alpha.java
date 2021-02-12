package ru.oshkina.demo2;

public class Alpha implements Calculator {

    @Override
    public int calc(int n) {
        //Вычисление двойного факториала числа
        if (n == 1 || n == 2) {
            return n;
        } else {
            return n * calc(n - 2);
        }
        // n!! = n * (n-2) * (n - 4)
        // n! = n * (n-1) * (n - 2)
    }
}
