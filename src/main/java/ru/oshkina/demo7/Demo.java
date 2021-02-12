package ru.oshkina.demo7;

public class Demo {
    public static void main(String[] args) {

        Alpha alpha = (String t) -> {
            return t.length();
        };

        Alpha alpha1 = new Alpha() {
            @Override
            public int get(String t) {
                return t.length();
            }
        };

        Alpha b = (String t) -> {
            return (int) (t.charAt(0));
        };

        String t = "Java";
        System.out.println("Длина текста=" + alpha.get(t) + " " + alpha1.get(t));
        System.out.println("Код символа=" + b.get(t));
    }
}
