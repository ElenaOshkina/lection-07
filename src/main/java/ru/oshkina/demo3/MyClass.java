package ru.oshkina.demo3;

public class MyClass extends Base implements Alpha, Bravo{

    int value;

    @Override
    public void apply(int n) {
        number = n;
    }

    @Override
    public void set(int n) {
        value = n;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Поле value:" + value);
    }
}
