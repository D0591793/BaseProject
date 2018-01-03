package com.github.team;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;

public class frame {
    public static void main(String[] args){

        /*set frame*/
        JFrame jframe = new JFrame();
        jframe.setSize(375,640);
        jframe.setLocationRelativeTo(null);


        /*get contentpane and set background*/
        jframe.getContentPane().setBackground(Color.white);
        jframe.setLayout(null);


        /*set Label*/
        JLabel label = new JLabel("時間管理");
        label.setBounds(125,100,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jframe.add(label);


        /*set Button*/
        Button btn1 = new Button("排入上班課行程");
        btn1.setBounds(110,200,150,25);
        jframe.add(btn1);

        Button btn2 = new Button("自動規劃娛樂活動");
        btn2.setBounds(110,250,150,25);
        jframe.add(btn2);

        Button btn3 = new Button("鬧鐘");
        btn3.setBounds(110,300,150,25);
        jframe.add(btn3);

        Button btn4 = new Button("在線專家");
        btn4.setBounds(110,350,150,25);
        jframe.add(btn4);

        Button btn5 = new Button("排入其他待辦事項");
        btn5.setBounds(110,400,150,25);
        jframe.add(btn5);



        /*!!!!!important!!!!*/
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);

    }




}

