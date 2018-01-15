package com.github.asd0591804;

import com.github.team.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test implements ActionListener {
    private JFrame jFrame;
    public test(JFrame jFrame){
        this.jFrame = jFrame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.setVisible(false);

        /*設$此頁*/
        JFrame jframe2 = new JFrame();//新增物件
        jframe2.setSize(375,640);//大小
        jframe2.setLocation(jFrame.getLocation());//取得前一頁位置
        jframe2.getContentPane().setBackground(Color.white);//背景顏色
        jframe2.setLayout(null);//用座標排版

        /*set Label*/
        JLabel label = new JLabel("Clock");//標題
        label.setBounds(105,0,200,50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中



        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new frame(jFrame,jframe2));//跟主頁傳過來的方法一樣





        //這個只是示範
        JButton delete = new JButton("delete");
        delete.setBounds(260,10,80,30);
        jframe2.add(delete);

        //下面是偵測這顆按鈕 他要做的事要在裡面寫
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //這裡
            }
        });




        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
