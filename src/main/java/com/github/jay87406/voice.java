package com.github.jay87406;

import com.github.team.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voice implements ActionListener {
    private JFrame jFrame;
    private JFrame jFrame3;

    public voice(JFrame jFrame,JFrame jframe2){
        this.jFrame = jframe2; //第二頁
        this.jFrame3 = jFrame;//原本的第一頁

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
        JLabel label = new JLabel("語音電話");//標題
        label.setBounds(105,0,200,50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中



        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new setOnlineExpert(jFrame3));//47~53都要 這裡的jFrame3是原本的第一頁
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe2.dispose();
            }
        });

        JLabel label1 = new JLabel("語音電話");
        label1.setBounds(125,150,150,50);
        label1.setFont(new Font("",Font.BOLD,30));
        JLabel label2 = new JLabel("0800-XXX-XXX");
        label2.setBounds(110,300,250,80);
        label2.setFont(new Font("",Font.BOLD,24));
        jframe2.add(label1);
        jframe2.add(label2);



        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
