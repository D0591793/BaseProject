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
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new frame(jframe,jframe2));

        getCalender calender = new getCalender();

        String[] yearbox = new String[5];

        for (int i =0; i < 5; i++){
            yearbox[i] = Integer.toString(calender.getyear()+i);
            System.out.println(yearbox[i]);
        }

        String[] monthbox = new String[12];

        for (int i =0; i < 12; i++){
            monthbox[i] = Integer.toString(i+1);
            System.out.println(monthbox[i]);
        }

        String[] datebox = new String[31];
        for (int i = 0; i< 31 ; i++){
            datebox[i] = Integer.toString(i+1);
            System.out.println(datebox[i]);

        }

        JComboBox yearCombobox = new JComboBox(yearbox);
        yearCombobox.setBounds(50,100,60,20);
        jframe2.add(yearCombobox);

        JComboBox monthCombobox = new JComboBox(monthbox);
        monthCombobox.setBounds(150,100,50,20);
        jframe2.add(monthCombobox);

        JComboBox dateCombobox = new JComboBox(datebox);
        dateCombobox.setBounds(250,100,50,20);
        jframe2.add(dateCombobox);

        /*select  year  set  datebox */
        yearCombobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (monthCombobox.getSelectedItem().toString()) {
                    case "1": case "3": case "5": case "7": case "8": case "10": case "12":
                        dateCombobox.removeAllItems();
                        for (int i = 0; i < 31; i++) {
                            dateCombobox.addItem(i + 1);
                        }
                        break;

                    case "2":
                        dateCombobox.removeAllItems();
                        int check = Integer.parseInt(yearCombobox.getSelectedItem().toString());
                        if (check % 4 == 0) {
                            for (int i = 0; i < 29; i++) {
                                dateCombobox.addItem(i + 1);
                            }
                        } else {
                            for (int i = 0; i < 28; i++) {
                                dateCombobox.addItem(i + 1);
                            }
                        }
                        break;

                    case "4": case "6": case "9": case "11":
                        dateCombobox.removeAllItems();
                        for (int i = 0; i < 30; i++) {
                            dateCombobox.addItem(i + 1);
                        }
                        break;

                    default:
                        break;
                }
            }
        });

        /*select month  set  datebox */
        monthCombobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch (monthCombobox.getSelectedItem().toString()){
                   case "1": case"3": case"5": case"7": case"8": case "10": case "12":
                       dateCombobox.removeAllItems();
                       for (int i=0;i<31;i++) {
                           dateCombobox.addItem(i + 1);
                       }
                       break;

                   case "2":
                       dateCombobox.removeAllItems();
                       int check = Integer.parseInt(yearCombobox.getSelectedItem().toString());
                       if (check % 4 ==0){
                           for (int i=0;i<29;i++) {
                               dateCombobox.addItem(i + 1);
                           }
                       }else {
                           for (int i=0;i<28;i++) {
                               dateCombobox.addItem(i + 1);
                           }
                       }
                       break;

                   case "4": case"6": case"9": case"11":
                       dateCombobox.removeAllItems();
                       for (int i=0;i<30;i++) {
                           dateCombobox.addItem(i + 1);
                       }
                       break;

                       default:
                           break;

               }
            }
        });



        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe2.setVisible(true);

    }



}
