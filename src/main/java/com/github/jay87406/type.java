package com.github.jay87406;

import com.github.team.frame;
import com.github.ych861031.printSchedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class type implements ActionListener {
    private JFrame jFrame;
    private JFrame jFrame3;

    public type(JFrame jFrame,JFrame jframe2){
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
        JLabel label = new JLabel("線上問答");//標題
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

        JTextField jTextField = new JTextField();
        jTextField.setBounds(60,520,180,24);
        jframe2.add(jTextField);

        JButton confirm = new JButton("確認");
        confirm.setBounds(245,520,60,24);
        jframe2.add(confirm);
        int index = 0;


        // String input=JOptionPane.showInputDialog(null,"請輸入:","輸入對話框",JOptionPane.QUESTION_MESSAGE);


        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
