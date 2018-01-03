package com.github.team;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;

public class frame {
    public static void main(String[] args){
        JFrame jframe = new JFrame();

        jframe.setSize(375,640);
        jframe.setLocationRelativeTo(null);

        jframe.setLayout(null);

        JLabel label = new JLabel("時間管理");
        label.setBounds(125,100,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jframe.add(label);



        Button btn1 = new Button("test1");
        btn1.setBounds(157,200,60,25);
        jframe.add(btn1);

        Button btn2 = new Button("test2");
        btn2.setBounds(157,250,60,25);
        jframe.add(btn2);

        Button btn3 = new Button("test3");
        btn3.setBounds(157,300,60,25);
        jframe.add(btn3);

        Button btn4 = new Button("test4");
        btn4.setBounds(157,350,60,25);
        jframe.add(btn4);

        Button btn5 = new Button("test5");
        btn5.setBounds(157,400,60,25);
        jframe.add(btn5);



        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);



    }




}

