package ru.oshkina.demo1;

public class MyClass implements Alpha {

    private int code;

    @Override
    public void set(int n) {
        if (n >= 0) {
            this.code = n;
        } else {
            this.code -= n;
        }
        System.out.println("Число:" + code);
    }

    /**
     * Перевод значения числа в другую
     * систему счисления
     */
    @Override
    public String get() {
        String res = "|";
        int number = code;
        do {
            res = "|" + (number % NUMBER) + res;
            number /= NUMBER;
        } while (number > 0);
        return res;
    }
}
