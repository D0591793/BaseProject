package com.github.jay87406;

import com.github.team.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setOnlineExpert implements ActionListener {
    private JFrame jFrame;

    public setOnlineExpert(JFrame jFrame){
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
        JLabel label = new JLabel("在線專家");//標題
        label.setBounds(105,0,200,50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中



        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new frame(jFrame,jframe2));//跟主頁傳過來的方法一樣


        JButton btn1 = new JButton("語音提問");
        btn1.setBounds(60,200,250,40);
        jframe2.add(btn1);

        JButton btn2 = new JButton("線上問答");
        btn2.setBounds(60,350,250,40);
        jframe2.add(btn2);

        btn1.addActionListener(new voice(jframe2));
        //setOnlineExpert.setVisible(true);
        btn2.addActionListener(new type(jFrame,jframe2));




        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
