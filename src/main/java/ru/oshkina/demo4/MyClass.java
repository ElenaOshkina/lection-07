package ru.oshkina.demo4;

public class MyClass implements Bravo {

    @Override
    public int alpha(int n) {
        if (n == 0) {
            return 0;
        }
        return n + alpha(n - 1);
    }

    /**
     * Метод вычисления числа Фиббоначи
     */
    @Override
    public int bravo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return bravo(n - 1) + bravo(n - 2);// 1 1 2 3 5 8
        }
    }
}
