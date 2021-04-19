package Java1_Ivan_Lesson6XOG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;//Ширина окна
    private static final int WIN_HEIGHT = 555;//Высота окта
    private static final int WIN_POSX = 1250;// Место точки начало окна по оси Х
    private static final int WIN_POSY = 110;//Место точки начало окна по оси У
    private FieldPanel fieldPanel;//Поля класса GameWindow, при создании объекта FieldPanel будет ссылаться на кокое-то место в памяти
    private SettingsWindow settingsWindow;//Поля класса GameWindow, при создании объекта SettingsWindow будет ссылаться на кокое-то место в памяти

    GameWindow() {

        setSize(WIN_WIDTH, WIN_HEIGHT);//Размер окна
        setLocation(WIN_POSX, WIN_POSY);//Место на Экране

        setDefaultCloseOperation(EXIT_ON_CLOSE);// Действие по умолчанию при  нажатие крестика
        setTitle("Tic Tak Toe");// Название окта
        setResizable(false);//Изменение размеров (в нашем случае невозможно)
        settingsWindow = new SettingsWindow(this);// создаем окно настроек и передаем в него согданый объект GameWindow

        JButton btnStart = new JButton("Start");//Создание объекта Кнопки Старт
        JButton btnStop = new JButton("Stop");//Создание объекта кнопки Стоп
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//При нажатии кнопки стоп останавливается работа программы
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);//При нажатии кнопки старт окно настроек станет видимым, созданное на 24 строке
            }
        });


        JPanel jPanel = new JPanel(new GridLayout(1, 2));//Создание панельки на которой размещен компонент состоящий из 1 стороки и 2 столбцов
        jPanel.add(btnStart);//Добавление на панель кнопки Старт
        jPanel.add(btnStop);// Добавление на панель кнопки Стоп
        add(jPanel, BorderLayout.SOUTH);// Добавление на наше окно панельки,которая расположена на юге(внизу).
        fieldPanel = new FieldPanel();//создаем объект fieldPanel, переменная ссылается на
        add(fieldPanel);// добавляем его на GameWindow

        setVisible(true);//Видимость окна


    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLeight) {//  method resive few parametr, gameMode(HvsH,HvsAi and etc)
        fieldPanel.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLeight);
    }
}
