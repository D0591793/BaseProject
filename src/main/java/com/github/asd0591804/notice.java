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
            int min = cal.get(Calendar.MINUTE);//抓現在時間
            if(settime.arrayAlarm[0] != null && !timeReached) {
                int alarmHour = settime.arrayAlarm[0].get(Calendar.HOUR_OF_DAY);
                int alarmMin = settime.arrayAlarm[0].get(Calendar.MINUTE);
                if(alarmHour == hour && alarmMin == min) {
                    if (settime.arrayAlarm[0] == null) {
                        timeReached = true;
                    }

                    System.out.println("Time over array[0]");
                    startAlarm();
                }
            }
        }
    }, 0, 1000L); // 每隔 1 秒刷新

    }


    public static void startAlarm(){//計時到時跳出視窗
        JLabel stop = new JLabel("時間到");
        stop.setBounds(75,100,80,30);
        stop.setFont(new Font("",Font.CENTER_BASELINE,25));
        newinter.add(stop);
        newinter.setBackground(Color.white);
        newinter.setSize(250 , 250);
        newinter.setLayout(null);
        newinter.setLocationRelativeTo(null);

        JButton back = new JButton("確定");
        back.setBounds(80 ,150,80,30);
        newinter.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newinter.setVisible(false);

            }
        });

        newinter.setVisible(true);
        int i=0;//刪掉已到時間
        while (i+1<settime.arrayAlarm.length){
            settime.arrayAlarm[i] = settime.arrayAlarm[i+1];
            settime.addThing[i] = settime.addThing[i+1];
            i++;
        }
        settime.num=settime.num-1;//刪掉一個時間，所以位置往前移一格

        settime.arrayAlarm[i]=null;//往前移後，最後一個是空
        settime.addThing[i]=null;


    }
}
