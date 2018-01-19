package com.github.ych861031;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.github.team.frame;

public class printSchedule {

    public static void print(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(375,640);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(null);
        jFrame.setLocation(0,0);


        JLabel label = new JLabel("行程表");
        label.setBounds(130,0,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jFrame.add(label);

        JLabel[] jLabels = new JLabel[100]; //date
        JLabel[] jLabels1 = new JLabel[100];//title
        JLabel[] jLabels2 = new JLabel[100];//start
        JLabel[] jLabels3 = new JLabel[100];//end
        JLabel[] jLabels4 = new JLabel[100];//index
        JLabel[] jLabels5 = new JLabel[100];//~
        JLabel[] jLabels6 = new JLabel[100];//type

        for (int i=0;i<frame.index;i++){
            jLabels[i]=new JLabel(Integer.toString(frame.timeArray[i]));
            jLabels[i].setFont(new Font("",Font.BOLD,14));
            jLabels[i].setBounds(30,25*i+60,100,20);
            jFrame.add(jLabels[i]);

            jLabels1[i]=new JLabel(frame.textArray[i]);
            jLabels1[i].setFont(new Font("",Font.BOLD,14));
            jLabels1[i].setBounds(100,25*i+60,80,20);
            jFrame.add(jLabels1[i]);

            jLabels2[i]=new JLabel(frame.timeSArray[i]);
            jLabels2[i].setFont(new Font("",Font.BOLD,14));
            jLabels2[i].setBounds(180,25*i+60,100,20);
            jFrame.add(jLabels2[i]);

            jLabels3[i]=new JLabel(frame.timeEArray[i]);
            jLabels3[i].setFont(new Font("",Font.BOLD,14));
            jLabels3[i].setBounds(240,25*i+60,100,20);
            jFrame.add(jLabels3[i]);

            jLabels4[i]=new JLabel(Integer.toString(i+1));
            jLabels4[i].setFont(new Font("",Font.BOLD,14));
            jLabels4[i].setBounds(10,25*i+60,20,20);
            jFrame.add(jLabels4[i]);

            jLabels5[i]=new JLabel("~");
            jLabels5[i].setFont(new Font("",Font.BOLD,14));
            jLabels5[i].setBounds(220,25*i+60,100,20);
            jFrame.add(jLabels5[i]);

            jLabels6[i]=new JLabel(frame.typeArray[i]);
            jLabels6[i].setFont(new Font("",Font.BOLD,14));
            jLabels6[i].setBounds(300,25*i+60,100,20);
            switch (frame.typeArray[i]){
                case "上班":
                    jLabels6[i].setForeground(Color.BLUE);
                    break;
                case "上課":
                    jLabels6[i].setForeground(Color.RED);
                    break;
                case "其他":
                    jLabels6[i].setForeground(Color.YELLOW);
                    break;
                default:
                    break;
            }
            jFrame.add(jLabels6[i]);
        }
        JButton delete = new JButton("delete");
        delete.setBounds(260,10,80,30);
        jFrame.add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("delete");

                jFrame1.setSize(250,200);
                jFrame1.setLocationRelativeTo(null);
                jFrame1.getContentPane().setBackground(Color.white);
                jFrame1.setLayout(null);
                jFrame1.setLocation(50,220);

                JTextField  a = new JTextField();
                a.setBounds(80,50,60,20);
                jFrame1.add(a);
                JLabel jLabel = new JLabel("index");
                jLabel.setBounds(45,43,60,30);
                jFrame1.add(jLabel);

                JButton yes = new JButton("yes");
                yes.setBounds(80,100,60,30);
                jFrame1.add(yes);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jFrame1.setVisible(false);
                        jFrame.setVisible(false);
                        if (Integer.parseInt(a.getText())-1<frame.index && Integer.parseInt(a.getText())-1>=0){
                            for (int i=Integer.parseInt(a.getText())-1;i<frame.index;i++){
                                frame.timeArray[i] = frame.timeArray[i+1];
                                frame.timeSArray[i] = frame.timeSArray[i+1];
                                frame.timeEArray[i] = frame.timeEArray[i+1];
                                frame.textArray[i] = frame.textArray[i+1];
                                frame.typeArray[i] = frame.typeArray[i+1];
                            }
                            frame.index--;
                        }






                        printSchedule.print();
                    }
                });

                jFrame1.setVisible(true);
            }
        });

        jFrame.setVisible(true);
    }






}
