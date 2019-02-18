package com.bcv.finalProject;

import com.bcv.finalProject.FlatArea.ButtJoint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Program for calculate mass of welding consumables
 */

public class WeldingCalculator extends JFrame {

    private JPanel mainPanel;

    private JLabel labelWeldProcedure;
    private JComboBox weldProcedure;

    private JLabel labelStandardWeldingJoint;
    private JTextField standardWeldingJoint;

    private JLabel labelTypeWeldingJoint;
    private JComboBox typeWeldingJoint;

    private JLabel labelWeldingPosition;
    private JComboBox weldingPosition;

    private JLabel labelWallThickness;
    private JSpinner sizeWallThickness;

    private JLabel labelGap;
    private JSpinner sizeGap;

    private JLabel labelLengthWeldJoint;
    private JSpinner sizeLengthWeldJoint;

    private JButton calculate;

    private JTextField result;
    private JLabel imageLabel;



    public WeldingCalculator() {
        listenerStandart();
        listenerCalculate();
        listenerWeldingPosition();


    }



    private void listenerWeldingPosition() {

        weldingPosition.addItemListener(new ItemListener() {
            double kpol = 0;

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (weldingPosition.getSelectedIndex() == 0) {
                    kpol = 1.0;
                } else if (weldingPosition.getSelectedIndex() == 1) {
                    kpol = 1.1;
                } else {
                    kpol = 1.2;
                }
            }
        });
    }

    public void listenerCalculate() {


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //if gap is 0 then in formulas b=1. При сварке зазор между деталями может составлять 0 мм, но тогда будет ошибка в расчете
                int sizeGapZero = (int) sizeGap.getValue();
                if (sizeGapZero == 0) {

                    sizeGapZero = 1;

                }

                //Check values in fields for computation and place result in result:JTextField.
                if ((int) sizeWallThickness.getValue() > 0 && (int) sizeLengthWeldJoint.getValue() > 0) {

                    //сделать выбор формулы расчета в отдельно методе
                    result.setText(ButtJoint.c1((int) (sizeWallThickness.getValue()), sizeGapZero, 1.0, 1.0) + "");
                } else {
                    JOptionPane.showMessageDialog(null, "И кого Вы пытаетесь обмануть?\nТолщина свариваемых деталей или длина сварного шван не могут быть меньше 1!", "Error", JOptionPane.PLAIN_MESSAGE);
                }

                String message = "";

                message += "Button was pressed\n";
                message += "Способ сварки: " + weldProcedure.getSelectedItem() + "\n";
                message += "Стандарт: " + standardWeldingJoint.getText() + "\n";
                message += "Тип сварного соединения: " + typeWeldingJoint.getSelectedItem() + "\n";
                message += "Положение при сварке: " + weldingPosition.getSelectedItem() + "\n";
                message += "Толщина свариваемых деталей: " + sizeWallThickness.getValue() + "\n";
                message += "Зазор: " + sizeGap.getValue() + "\n";
                message += "sizeGapZero: " + sizeGapZero + "\n";
                message += "Длина сварного шва: " + sizeLengthWeldJoint.getValue() + "\n";
                message += "Test line: " + ButtJoint.c1((int) (sizeWallThickness.getValue()), (int) (sizeGap.getValue()), 1.0, 1.0);
                JOptionPane.showMessageDialog(null,
                        message,
                        "Test message",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });
    }

    /**
     * Listener change Standard according to selected weld procedure
     */
    private void listenerStandart() {
        weldProcedure.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
//check what weld procedure select user and than change standart
                    double k = 0;
                    if (weldProcedure.getSelectedIndex() == 0) {
                        standardWeldingJoint.setText("ГОСТ 14771-76");
                        k = 1.1;
                    } else if (weldProcedure.getSelectedIndex() == 1) {
                        standardWeldingJoint.setText("ГОСТ 14771-76");
                        k = 1.05;
                    } else if (weldProcedure.getSelectedIndex() == 2) {
                        standardWeldingJoint.setText("ГОСТ 14771-76");
                        k = 1.2;
                    } else if (weldProcedure.getSelectedIndex() == 3) {
                        standardWeldingJoint.setText("ГОСТ 5264-80");
                        k = 1.6;
                    } else if (weldProcedure.getSelectedIndex() == 4) {
                        standardWeldingJoint.setText("ГОСТ 8713-79");
                        k = 1.02;
                    }
                }
            }

        });
    }


    public static void main(String[] args) {
/**
 * Creating and Disposing of a Form's Runtime Frame
 */
        JFrame frame = new JFrame();
        frame.setContentPane(new WeldingCalculator().mainPanel);
        frame.setTitle("weldering.com");
        frame.setLocationRelativeTo(null); //place frame in the center of screen
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //Window to be sized to fit the preferred size and layouts of its subcomponents


    }


}
