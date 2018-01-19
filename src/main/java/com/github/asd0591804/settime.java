package com.github.asd0591804;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class settime {
    public static Calendar alarmCal;

    public static void timesetting (){
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setTitle("設置");

        JLabel labelHour = new JLabel("時");
        labelHour.setFont(new Font("", Font.BOLD, 18));
        labelHour.setBounds(90,120,50,30);
        jFrame.add(labelHour);

        JLabel labelMin = new JLabel("分");
        labelMin.setFont(new Font("", Font.BOLD, 18));
        labelMin.setBounds(250,120,50,30);
        jFrame.add(labelMin);

        JTextField textHour = new JTextField();
        textHour.setBounds(40,150,120,30);
        jFrame.add(textHour);

        JTextField textMin = new JTextField();
        textMin.setBounds(200,150,120,30);
        jFrame.add(textMin);

        JButton btnBack = new JButton("返回");
        btnBack.setBounds(30,200,110,30);
        jFrame.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
            }
        });


        JButton btnOk = new JButton("確認");
        btnOk.setBounds(220,200,110,30);
        jFrame.add(btnOk);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = 0, min = 0;

                hour = Integer.parseInt(textHour.getText());
                min = Integer.parseInt(textMin.getText());

                startTimer(hour,min);
                test.endTime(temp);//傳時間過去存陣列
                jFrame.setVisible(false);
                notice.initTimer();

            }
        });




    }
    public static String temp = new String();
    public static void startTimer(int hour, int minute) {
        System.out.println("開始");
        alarmCal = Calendar.getInstance();
        alarmCal.set(Calendar.HOUR_OF_DAY, hour);
        alarmCal.set(Calendar.MINUTE, minute);
        alarmCal.set(Calendar.SECOND, 0);
        temp = String.valueOf(alarmCal.getTime());
    }
}
