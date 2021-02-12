package ru.oshkina.demo2;

public class Demo {
    public static void main(String[] args) {
        //Интерфейсная переменная
        Calculator r;

        r = new Alpha();
        System.out.println("5!!=" + r.calc(5));

        r = new Bravo();
        System.out.println("5!=" + r.calc(5));
    }
}
