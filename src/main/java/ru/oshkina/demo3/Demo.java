package ru.oshkina.demo3;

public class Demo {
    public static void main(String[] args) {
        Alpha alpha;
        Bravo bravo;

        MyClass myClass = new MyClass();
        //интерфейсные ссылки
        alpha = myClass;
        bravo = myClass;

        alpha.apply(100);
        bravo.set(200);

        //Проверка
        myClass.show();
    }
}
