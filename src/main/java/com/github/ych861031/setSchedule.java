package com.github.ych861031;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setSchedule implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        /*set frame*/
        JFrame jframe = new JFrame();
        jframe.setSize(375,640);
        jframe.setLocationRelativeTo(null);


        /*get contentpane and set background*/
        jframe.getContentPane().setBackground(Color.white);
        jframe.setLayout(null);


        /*set Label*/
        JLabel label = new JLabel("行程表");
        label.setBounds(130,0,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jframe.add(label);


        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }



}
