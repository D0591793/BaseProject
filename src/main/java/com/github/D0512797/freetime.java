package com.github.D0512797;

import com.github.team.frame;
import com.github.ych861031.printSchedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class freetime {

    public static void print(){

        JFrame jFrame = new JFrame();
        jFrame.setSize(375,640);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(null);
        jFrame.setLocation(0,0);


        JLabel label = new JLabel("活動推薦");
        label.setBounds(120,0,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jFrame.add(label);

//        JLabel labe2 = new JLabel("1.放一首新歌");
//        labe2.setBounds(20,80,200,25);
//        labe2.setFont(new Font("", Font.BOLD, 22));
//        jFrame.add(labe2);
//
//        JLabel labe3 = new JLabel("2.看新聞");
//        labe3.setBounds(20,120,200,25);
//        labe3.setFont(new Font("", Font.BOLD, 22));
//        jFrame.add(labe3);
//
//        JLabel labe4 = new JLabel("3.看一個笑話");
//        labe4.setBounds(20,160,200,25);
//        labe4.setFont(new Font("", Font.BOLD, 22));
//        jFrame.add(labe4);
//
//        JLabel labe5 = new JLabel("4.播短片");
//        labe5.setBounds(20,200,200,25);
//        labe5.setFont(new Font("", Font.BOLD, 22));
//        jFrame.add(labe5);
//
//        JLabel labe6 = new JLabel("5.玩小遊戲");
//        labe6.setBounds(20,240,200,25);
//        labe6.setFont(new Font("", Font.BOLD, 22));
//        jFrame.add(labe6);

        JLabel labe11 = new JLabel("空閒時間:");
        labe11.setBounds(20,65,200,25);
        labe11.setFont(new Font("", Font.BOLD, 16));
        jFrame.add(labe11);

        JLabel labe2 = new JLabel("1.看電影");
        labe2.setBounds(20,120,200,25);
        labe2.setFont(new Font("", Font.BOLD, 22));
        jFrame.add(labe2);

        JButton addfreetime1 = new JButton("排入行程");
        addfreetime1.setBounds(180,120,100,25);
        jFrame.add(addfreetime1);

        JLabel labe3 = new JLabel("2.逛街");
        labe3.setBounds(20,160,200,25);
        labe3.setFont(new Font("", Font.BOLD, 22));
        jFrame.add(labe3);

        JButton addfreetime2 = new JButton("排入行程");
        addfreetime2.setBounds(180,160,100,25);
        jFrame.add(addfreetime2);

        JLabel labe4 = new JLabel("3.附近的景點");
        labe4.setBounds(20,200,200,25);
        labe4.setFont(new Font("", Font.BOLD, 22));
        jFrame.add(labe4);

        JButton addfreetime3 = new JButton("排入行程");
        addfreetime3.setBounds(180,200,100,25);
        jFrame.add(addfreetime3);

        JLabel labe5 = new JLabel("4.小睡");
        labe5.setBounds(20,240,200,25);
        labe5.setFont(new Font("", Font.BOLD, 22));
        jFrame.add(labe5);

        JButton addfreetime4 = new JButton("排入行程");
        addfreetime4.setBounds(180,240,100,25);
        jFrame.add(addfreetime4);

        JLabel labe6 = new JLabel("5.吃美食");
        labe6.setBounds(20,280,200,25);
        labe6.setFont(new Font("", Font.BOLD, 22));
        jFrame.add(labe6);

        JButton addfreetime5 = new JButton("排入行程");
        addfreetime5.setBounds(180,280,100,25);
        jFrame.add(addfreetime5);

        jFrame.setVisible(true);
    }
}
