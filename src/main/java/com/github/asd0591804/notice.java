package com.github.asd0591804;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class notice {

    public static Timer timer;

    private static boolean timeReached = true;


    static JFrame newinter = new JFrame();

    public static void initTimer() {//開始倒數計時
        timeReached = false;

        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {

            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);

            if(null != settime.alarmCal && !timeReached) {
                int alarmHour = settime.alarmCal.get(Calendar.HOUR_OF_DAY);
                int alarmMin = settime.alarmCal.get(Calendar.MINUTE);
                if(alarmHour == hour && alarmMin == min) {
                    timeReached = true;
                    System.out.println("Time over");
                    startAlarm();
                }
            }
        }
    }, 0, 100L); // 每隔 1 秒刷新

    }


    public static void startAlarm(){//計時到時跳出視窗
        JLabel stop = new JLabel("時間到");
        stop.setBounds(75,100,80,30);
        stop.setFont(new Font("", Font.BOLD, 25));
        newinter.add(stop);
        newinter.setBackground(Color.white);
        newinter.setSize(250 , 250);
        newinter.setLayout(null);
        newinter.setLocationRelativeTo(null);

        test.array[test.index]=test.array[test.index+1];//刪掉已到時間

        JButton back = new JButton("返回");
        back.setBounds(20,10,80,30);
        newinter.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newinter.setVisible(false);

            }
        });
        newinter.setVisible(true);
    }
}
