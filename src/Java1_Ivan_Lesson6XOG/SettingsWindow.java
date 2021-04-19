package Java1_Ivan_Lesson6XOG;

import javafx.scene.control.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_WIDTH = 507;//Ширина окна
    private static final int WINDOW_HEIGHT = 555;//Высота окта
    private static final int MIN_WIN_LENGHT = 3;//Минимальная длина победы
    private static final int MIN_FIELD_SIZE = 3;//минимальная размер окна
    private static final int MAX_FIELD_SIZE = 10;//максимальный размер окна
    private static final String FIELD_SIZE_PREFIX = "Field size is: ";//строка которую добавим на панельку
    private static final String WIN_SIZE_LENGHT = "Win line is: ";//строка которую длобавим на панельку

    private GameWindow gameWindow;//поля класса SettingsWindow
    private JRadioButton humVsAi;//поля класса, кнопка выбора мода игры человек против компьютера
    private JRadioButton humVsHm;//поля класса, кнопка выбора мода игры человек против человека
    private JSlider sliderWinLen;//поля класса, слайдер выбора длины победной линии
    private JSlider sliderFieldSize;// поля класса , слайдер выбора длины поля

    SettingsWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;//передаем ссылку на объект GameWindow, полю класса SettingsWindow.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT / 2);//присваиваем размеры окна
        Rectangle rectangle = gameWindow.getBounds();//Объека ,Прямоугольник задает область в координатном пространстве,
        // заключенную в верхнюю левую точку объекта Прямоугольника (x, y) в координатном пространстве,
        // его ширину и высоту.
        int posX = (int) rectangle.getCenterX() - WINDOW_WIDTH / 2;//место расположения точки по оси Х
        int posY = (int) rectangle.getCenterY() - WINDOW_HEIGHT / 4;//место расположения точки по оси Х
        setLocation(posX, posY);//Перемещает этот компонент в новое место. Верхний левый угол нового местоположения
        // задается параметрами x и y в координатном пространстве родительского компонента.

        setDefaultLookAndFeelDecorated(true);//Дает подсказку о том, должны ли вновь созданные JFrames иметь свои
        // оконные украшения (такие как границы, виджеты для закрытия окна, заголовок...),
        // предоставляемые текущим внешним видом
        setResizable(false);//Изменение окна настроек
        setTitle("Settings");// название окна
        setLayout(new GridLayout(10, 1));//создаем компанент и размещаем на него новый компонент
        // состоящий из 10 строк и 1 столбца
        addGameControlMode();//вызов метода выбора игровога мода
        addGameControlsField();//вызов метода определяющий размеры поля и длины выигрыша
        Button btnStart = new Button("Start Game");// создание кнопки старт
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartClick();// при нажатии кнопки в gameWindow передаются параметры мода игры,
                // ширины поля и длина выйгрышной линии
            }
        });
        add(btnStart);//добавление на компанент кнопки старт

    }

    private void addGameControlMode() {
        add(new JLabel("Chosse game Mode: "));//добавление на компанент нового объекта JLabel
        humVsAi = new JRadioButton("Human Vs Ai", true);//создаем новый объект JRadioButton "Human Vs Ai"
        // и автоматически выбираем его по умолчанию
        humVsHm = new JRadioButton("Humam Vs Human");//создаем новый объект JRadioButton "Human Vs Human"
        ButtonGroup gameMode = new ButtonGroup();//создаем объект группировки кнопок
        gameMode.add(humVsAi);//добавляем первую
        gameMode.add(humVsHm);//добавляем вторую, делаем для того чтобы чтобы можно сгруппировать обе кнопки
        // ,чтобы после выбора одной вторую выбрать уже нельзя
        add(humVsAi);//добавляем компанент
        add(humVsHm);//добавляем компанент
    }

    private void addGameControlsField() {
        JLabel lblFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel lblWinLength = new JLabel(WIN_SIZE_LENGHT + MIN_WIN_LENGHT);
        sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderWinLen = new JSlider(MIN_WIN_LENGHT, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                lblFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                sliderWinLen.setMaximum(currentValue);
            }
        });
        sliderWinLen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblWinLength.setText(WIN_SIZE_LENGHT + sliderWinLen.getValue());
            }
        });

        add(new JLabel("Choose field size: "));
        add(lblFieldSize);
        add(sliderFieldSize);
        add(new JLabel("Choose Win Lenght: "));
        add(lblWinLength);
        add(sliderWinLen);
    }

    private void btnStartClick() {
        int gameMode;
        if (humVsAi.isSelected()) {
            gameMode = FieldPanel.MODE_HVA;
        } else if (humVsHm.isSelected()) {
            gameMode = FieldPanel.MODE_HVH;
        } else {
            throw new RuntimeException("Unknown game mode");
        }
        int fieldSize = sliderFieldSize.getValue();
        int winLen = sliderWinLen.getValue();

        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLen);
        setVisible(false);

    }
}
