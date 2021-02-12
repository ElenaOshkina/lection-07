package ru.oshkina.demo5;

public class Demo {
    public static void main(String[] args) {
        //создаем объект на основе анонимного класса
        Alpha alpha = new Alpha() {
            int number;

            @Override
            public void set(int n) {
                number = n;
            }

            @Override
            public int get() {
                return number;
            }
        };

        alpha.set(123);
        System.out.println("Поле:" + alpha.get());
    }

    class B implements Alpha {

        @Override
        public void set(int n) {

        }

        @Override
        public int get() {
            return 0;
        }
    }
}
