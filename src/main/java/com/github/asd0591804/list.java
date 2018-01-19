package com.github.asd0591804;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class list {
    public static void printfList(String[] array){

        JFrame jFrame = new JFrame();
        jFrame.setSize(400,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(null);
        jFrame.setLocation(0,0);

        String[] list = new String[20];
        int i = 0;
        for(i=0 ; i<array.length; i++) {
            list[i] = array[i];
        }
        for (int temp = 0; temp < array.length; temp++) {
            if (array[temp] != null) {
                JLabel endtime = new JLabel(temp+" : "+array[temp]);
                endtime.setBounds(50, 50 + temp * 20, 250, 30);
                jFrame.add(endtime);
            }
        }
        JButton back = new JButton("返回");
        back.setBounds(30,10,80,30);
        jFrame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);

            }
        });
        jFrame.setVisible(true);
    }
}
