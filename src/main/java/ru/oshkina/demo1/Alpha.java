package ru.oshkina.demo1;

public interface Alpha {
    int NUMBER = 5;//константное поле

    void set(int n);

    String get();

    default void show() {
        System.out.println("Результат:" + get());
    }
}
