package com.github.D0512797;

import com.github.team.frame;
import com.github.ych861031.printSchedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class temp implements ActionListener {
    private JFrame jFrame;
    public temp(JFrame jFrame){
        this.jFrame = jFrame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        /*隱藏前一頁*/
        jFrame.setVisible(false);

        /*設$此頁*/
        JFrame jframe2 = new JFrame();//新增物件
        jframe2.setSize(375,640);//大小
        jframe2.setLocation(jFrame.getLocation());//取得前一頁位置
        jframe2.getContentPane().setBackground(Color.white);//背景顏色
        jframe2.setLayout(null);//用座標排版

        /*set Label*/
        JLabel label = new JLabel("我好無聊");//標題
        label.setBounds(125,0,200,50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中



        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);


        btn.addActionListener(new frame(jFrame,jframe2));//跟主頁傳過來的方法一樣



        JButton open = new JButton("查看Schedule");
        open.setBounds(20,60,120,30);
        jframe2.add(open);
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printSchedule.print();
            }
        });

        JLabel label1 = new JLabel("今天有空的時間:");
        label1.setBounds(20,90,120,120);
        label1.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label1);

        JLabel label2 = new JLabel(":");
        label2.setBounds(123,180,10,20);
        label2.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label2);

        JLabel label3 = new JLabel("~");
        label3.setBounds(190,180,10,20);
        label3.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label3);

        JLabel label4 = new JLabel(":");
        label4.setBounds(263,180,10,20);
        label4.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label4);



        String[] timeH = new String[24];
        for (int i =0;i<24;i++){
            timeH[i] = Integer.toString(i);
        }
        String[] timeM = new String[60];
        for (int i =0;i<60;i++){
            timeM[i] = Integer.toString(i);
        }

        JComboBox timeHCombobox = new JComboBox(timeH);
        JComboBox timeMCombobox = new JComboBox(timeM);
        timeHCombobox.setBounds(60,180,60,20);
        timeMCombobox.setBounds(130,180,60,20);

        JComboBox timeEHCombobox = new JComboBox(timeH);
        JComboBox timeEMCombobox = new JComboBox(timeM);
        timeEHCombobox.setBounds(200,180,60,20);
        timeEMCombobox.setBounds(270,180,60,20);

        jframe2.add(timeHCombobox);
        jframe2.add(timeMCombobox);
        jframe2.add(timeEHCombobox);
        jframe2.add(timeEMCombobox);




        JButton confirm = new JButton("確認");
        confirm.setBounds(155,225,60,30);
        jframe2.add(confirm);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String a = timeEHCombobox.getSelectedItem().toString();//這個可以取得時間只是他是String 所以記得轉成int 才可以算
                int b = Integer.parseInt(a);//這樣就是int了

                //frame.setScheduleDateTime();//設定日期 可是我的一定要有日期 所以我這邊幫你用當下日期
                String Date = Integer.toString(Calendar.DATE);
                String Month = Integer.toString(Calendar.MONTH);
                String Year = Integer.toString(Calendar.YEAR);

                String CAL = Year + Month + Date;
                frame.setScheduleDateTime(Integer.parseInt(CAL));//這是設定日期 你不要改

                //你要做的是把選的時間取出來 就是第一行那個然後傳到你的freetime 可以寫static 就可以從freetime 呼叫


                //可以把第一格+第二格 就是開始時間
                frame.setStartTime("/*這裏面放開始時間*/");//存進去的時候要是String 如果可以最好把1這種得改成01 因為前面有轉成int要自己寫if加上去 我的class有寫
               //結束時間一樣的方法
                frame.setEndTime("/*這裏面放結束時間*/");
                frame.setType("娛樂");//設定類型




                freetime.print();
            }
        });
























        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
