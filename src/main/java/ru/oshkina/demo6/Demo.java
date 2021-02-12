package ru.oshkina.demo6;

import javax.swing.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;


public class Demo {
    public static void main(String[] args) {
        String title = "Улыбнитесь!";
        String path = "/Users/elenaoshkina/IdeaProjects/Lesson_7/src/main/resources/smiles/";

        //Объекты изображений
        ImageIcon smile = new ImageIcon(path + "smile.png");
        ImageIcon sad = new ImageIcon(path + "sad.png");

        JLabel label = new JLabel(sad);

        //Создаем обработчик для метки
        MouseListener mouseListener = new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setIcon(smile);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setIcon(sad);
            }

            //Методы с пустым телом
            @Override
            public void mouseClicked(MouseEvent e) {
                // Do nothing
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Do nothing
            }

            @Override
            public void mouseReleased(MouseEvent e){
                // Do nothing
            }
        };

        //Регистрация обработчика
        label.addMouseListener(mouseListener);
        //отображение окна
        JOptionPane.showMessageDialog(null,label, title, PLAIN_MESSAGE);
    }
}
