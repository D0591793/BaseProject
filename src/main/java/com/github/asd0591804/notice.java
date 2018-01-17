package com.github.asd0591804;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class notice {

    public static Timer timer;

    private static boolean timeReached = true;

    private static JLabel labelClock = new JLabel();
    static JLabel stop = new JLabel("Time's up");


    static JFrame newinter = new JFrame();

    public static void initTimer() {
        timeReached = false;

        timer = new Timer(); // 初始化倒计时任务
// 开始倒计时
        timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {

            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
// 设置倒计时文本
//            labelClock.setText(String.format("%02d : %02d : %02d"+"  %s"+"  " +
//                "%s", hour, min, sec,settime.alarmCal.get(Calendar.HOUR_OF_DAY),settime.alarmCal.get(Calendar.MINUTE)));

            if(null != settime.alarmCal && !timeReached) {
                int alarmHour = settime.alarmCal.get(Calendar.HOUR_OF_DAY);
                int alarmMin = settime.alarmCal.get(Calendar.MINUTE);
                if(alarmHour == hour && alarmMin == min) { // 到时间时播放声音
                    timeReached = true;
                    System.out.println("Time over");
                    startAlarm();
                }
            }
        }
    }, 0, 100L); // 每隔 1 秒刷新倒计时文本

    }


    public static void startAlarm(){
        System.out.println("停止");
        stop.setFont(new Font("", Font.CENTER_BASELINE, 25));
        newinter.add(stop);
        newinter.setBackground(Color.white);
        newinter.setSize(250 , 250);
        newinter.setLocationRelativeTo(null);
        newinter.setVisible(true);
    }
}
