package com.github.asd0591804;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class settime {

    public static Calendar[] arrayAlarm = new Calendar[20];
    public static String[] addThing = new String[20];


    public static void timesetting (){
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setTitle("設置");

        JLabel labelthing = new JLabel("事項");
        labelthing.setFont(new Font("", Font.BOLD, 18));
        labelthing.setBounds(50,40,50,30);
        jFrame.add(labelthing);

        JTextField textThing = new JTextField();
        textThing.setBounds(40,70,220,30);
        jFrame.add(textThing);

        JLabel labelHour = new JLabel("時");
        labelHour.setFont(new Font("", Font.BOLD, 18));
        labelHour.setBounds(90,120,50,30);
        jFrame.add(labelHour);

        JLabel labelMin = new JLabel("分");
        labelMin.setFont(new Font("", Font.BOLD, 18));
        labelMin.setBounds(200,120,50,30);
        jFrame.add(labelMin);

        JTextField textHour = new JTextField();
        textHour.setBounds(40,150,120,30);
        jFrame.add(textHour);

        JTextField textMin = new JTextField();
        textMin.setBounds(160,150,120,30);
        jFrame.add(textMin);

        JButton btnBack = new JButton("返回");
        btnBack.setBounds(50,200,110,30);
        jFrame.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
            }
        });


        JButton btnOk = new JButton("確認");
        btnOk.setBounds(200,200,110,30);
        jFrame.add(btnOk);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = 0, min = 0;
                String thing = "";

                hour = Integer.parseInt(textHour.getText());
                min = Integer.parseInt(textMin.getText());
                thing = textThing.getText();
                System.out.println(thing);

                setTimeArray(hour,min,thing);
                test.endTime(temp);//傳時間過去存陣列
                jFrame.setVisible(false);
                notice.initTimer();

            }
        });




    }
    public static String temp = new String();

    public static int num=0;//儲存陣列位置
    public static void setTimeArray(int hour, int minute, String thing) {
        System.out.println("開始");
        arrayAlarm[num] = Calendar.getInstance();
        arrayAlarm[num].set(Calendar.HOUR_OF_DAY, hour);
        arrayAlarm[num].set(Calendar.MINUTE, minute);
        arrayAlarm[num].set(Calendar.SECOND, 0);
        temp = String.valueOf(arrayAlarm[num].getTime());
        addThing[num] = thing;
        num=num+1;
    }
}
