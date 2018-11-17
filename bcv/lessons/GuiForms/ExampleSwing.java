package com.bcv.lessons.GuiForms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExampleSwing extends JFrame {

    public static void main(String[] args) {
        ExampleSwing app = new ExampleSwing();
        app.setVisible(true);
    }


    private JTextField input = new JTextField("", 1); //текстовое поле
    private JButton calculateButton = new JButton("Рассчитать количество сварочных материалов, кг"); //кнопку
    private JLabel label = new JLabel("Input:"); //название текстового поля

    String[] test = {
            "TIG",
            "MIG",
            "MAG",
            "MMA"
    };
    private JComboBox testJComboBox = new JComboBox(test);


    private JCheckBox check = new JCheckBox("Check", false); //чекбокс с галочкой
    SpinnerNumberModel gap = new SpinnerNumberModel(0, 0, 100, 1);
    private JSpinner gapSpinner = new JSpinner(gap);


    //конструктор
    public ExampleSwing() {
        super("Welding Calculator"); //название формы
        this.setBounds(200, 0, 600, 600); //размеры и положение окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //операция при закрытии

        Container aContainer = this.getContentPane(); //
        aContainer.setLayout(new GridLayout(11, 1, 2, 2)); //разбивка на секторы таблицей

        aContainer.add(testJComboBox);
        aContainer.add(gapSpinner);
        aContainer.add(label); //помещаем в окно надпись строка 11
        aContainer.add(input); //помещеем в окно поле ввода input


        ButtonGroup aGroup = new ButtonGroup();


        calculateButton.addActionListener(new ButtonEventListener()); //позволяет вызывать класс в котором реализуется наше действие
        aContainer.add(calculateButton); //добавляем конпку в нашу форму
    }

    //действие при нажатии на кнопку
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";

            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += "ComboBox " + testJComboBox.getSelectedIndex() + "\n";
            message += "JSpinner " + gapSpinner.getValue() + "\n";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }


}
