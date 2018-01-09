package com.github.ych861031;

import com.github.team.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class setSchedule implements ActionListener {

    private JFrame jframe;
    public setSchedule(JFrame jframe){
        this.jframe = jframe;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*hide frame1*/
        jframe.setVisible(false);

        /*add frame2*/
        JFrame jframe2 = new JFrame();
        jframe2.setSize(375,640);
        jframe2.setLocation(jframe.getLocation());
        jframe2.getContentPane().setBackground(Color.white);
        jframe2.setLayout(null);

        /*set Label*/
        JLabel label = new JLabel("行程表");
        label.setBounds(130,0,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jframe2.add(label);

        /*set button*/
        JButton btn = new JButton("返回");
        btn.setBounds(30,20,30,20);
        jframe2.add(btn);

        btn.addActionListener(new frame(jframe,jframe2));


        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe2.setVisible(true);

    }



}
