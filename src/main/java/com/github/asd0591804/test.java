package com.github.asd0591804;

import com.github.team.frame;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

public class test implements ActionListener {
    public static int index = 0;
    private JFrame jFrame;
    public static String[] array = new String[10];

    private Clip clip;
    private boolean timeReached = true;
    static TimerTask timer;

    public test(JFrame jFrame) {

        this.jFrame = jFrame;
    }

    /*時間刷新*/
    private void setTimer(JLabel time) {
        final JLabel varTime = time;
        Timer timeAction = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                long timemillis = System.currentTimeMillis();
                //转换日期显示格式
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                varTime.setText(df.format(new Date(timemillis)));
            }
        });
        timeAction.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.setVisible(false);

        /*設$此頁*/
        JFrame jframe2 = new JFrame();//新增物件
        jframe2.setSize(375, 640);//大小
        jframe2.setLocation(jFrame.getLocation());//取得前一頁位置
        jframe2.getContentPane().setBackground(Color.white);//背景顏色
        jframe2.setLayout(null);//用座標排版

        /*set Label*/
        JLabel label = new JLabel("鬧鐘");//標題
        label.setBounds(135, 0, 200, 50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中



        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20, 10, 80, 30);
        jframe2.add(btn);

        btn.addActionListener(new frame(jFrame, jframe2));//跟主頁傳過來的方法一樣

        JLabel now = new JLabel("現在時間:");
        now.setBounds(50, 30, 100, 50);
        now.setFont(new Font("", Font.BOLD, 18));
        jframe2.add(now);

        JLabel timelabel = new JLabel();//時間
        timelabel.setBounds(135, 30, 250, 50);//座標 長寬
        timelabel.setFont(new Font("", Font.BOLD, 18));//字型
        jframe2.add(timelabel);
        this.setTimer(timelabel);


        JButton settime = new JButton("設置");
        settime.setBounds(50, 100, 80, 30);
        jframe2.add(settime);
        settime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                com.github.asd0591804.settime.timesetting();

            }
        });


        JButton list = new JButton("鬧鐘列表");
        list.setBounds(175, 100, 120, 30);
        jframe2.add(list);

        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                com.github.asd0591804.list.printfList(com.github.asd0591804.settime.arrayAlarm);
            }
        });


        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示

    }

    public static void endTime(String time) {//抓取設定的時間存入陣列，印出用
        index = index + 1;
        array[index] = time;
        System.out.println(array[index]);
    }





    }
