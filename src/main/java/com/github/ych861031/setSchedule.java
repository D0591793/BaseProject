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
        JLabel label = new JLabel("設定行程表");
        label.setBounds(85,0,200,50);
        label.setFont(new Font("", Font.BOLD, 32));
        jframe2.add(label);

        JLabel label1 = new JLabel("日期");
        JLabel label2 = new JLabel("~");
        JLabel label3 = new JLabel("/");
        JLabel label4 = new JLabel("時間");
        JLabel label5 = new JLabel(":");
        JLabel label6 = new JLabel(":");
        JLabel label7 = new JLabel("標題");

        label1.setBounds(10,87,40,40);
        label1.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label1);
        label4.setBounds(20,127,40,40);
        label4.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label4);
        label2.setBounds(190,139,10,20);
        label2.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label2);
        label5.setBounds(123,138,10,20);
        label5.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label5);
        label6.setBounds(263,138,10,20);
        label6.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label6);
        label7.setBounds(20,160,60,40);
        label7.setFont(new Font("",Font.BOLD,14));
        jframe2.add(label7);

        /*set button*/
        JButton btn = new JButton("返回");
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new frame(jframe,jframe2));

        getCalender calender = new getCalender();

        /*combobox  初始值*/
        String[] yearbox = new String[5];
        for (int i =0; i < 5; i++){
            yearbox[i] = Integer.toString(calender.getyear()+i);
        }
        String[] monthbox = new String[12];
        for (int i =0; i < 12; i++){
            monthbox[i] = Integer.toString(i+1);
        }
        String[] datebox = new String[31];
        for (int i = 0; i< 31 ; i++){
            datebox[i] = Integer.toString(i+1);
        }

        JComboBox yearCombobox = new JComboBox(yearbox);
        yearCombobox.setBounds(60,100,60,20);
        jframe2.add(yearCombobox);

        JComboBox monthCombobox = new JComboBox(monthbox);
        monthCombobox.setBounds(130,100,50,20);
        jframe2.add(monthCombobox);

        JComboBox dateCombobox = new JComboBox(datebox);
        dateCombobox.setBounds(190,100,50,20);
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

        String[] timeH = new String[24];
        for (int i =0;i<24;i++){
            timeH[i] = Integer.toString(i);
        }
        String[] timeM = new String[12];
        for (int i =0;i<12;i++){
            timeM[i] = Integer.toString((i)*5);
        }

        JComboBox timeHCombobox = new JComboBox(timeH);
        JComboBox timeMCombobox = new JComboBox(timeM);
        timeHCombobox.setBounds(60,138,60,20);
        timeMCombobox.setBounds(130,138,60,20);

        JComboBox timeEHCombobox = new JComboBox(timeH);
        JComboBox timeEMCombobox = new JComboBox(timeM);
        timeEHCombobox.setBounds(200,138,60,20);
        timeEMCombobox.setBounds(270,138,60,20);

        jframe2.add(timeHCombobox);
        jframe2.add(timeMCombobox);
        jframe2.add(timeEHCombobox);
        jframe2.add(timeEMCombobox);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(60,172,100,20);
        jframe2.add(jTextField);

        JButton confirm = new JButton("確認");
        confirm.setBounds(155,200,60,30);
        jframe2.add(confirm);
        int index = 0;

        JLabel label8 = new JLabel("重複時間");
        label8.setBounds(200,200,100,50);
        label8.setFont(new Font("",Font.BOLD,14));

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String timeY = yearCombobox.getSelectedItem().toString();
                String timeM = monthCombobox.getSelectedItem().toString();
                String timeD = dateCombobox.getSelectedItem().toString();
                String timeSH = timeHCombobox.getSelectedItem().toString();
                String timeSMin = timeMCombobox.getSelectedItem().toString();
                String timeEH = timeEHCombobox.getSelectedItem().toString();
                String timeEMin = timeEMCombobox.getSelectedItem().toString();

                /*排列形成實用的到*/
                if (Integer.parseInt(timeM) < 10){
                    timeM = "0"+timeM;
                }
                if (Integer.parseInt(timeD) < 10){
                    timeD = "0"+timeD;
                }
                if (Integer.parseInt(timeSH) < 10){
                    timeSH = "0"+timeSH;
                }
                if (Integer.parseInt(timeSMin) < 10){
                    timeSMin = "0"+timeSMin;
                }
                if (Integer.parseInt(timeEH) < 10){
                    timeEH = "0"+timeEH;
                }
                if (Integer.parseInt(timeEMin) < 10){
                    timeEMin = "0"+timeEMin;
                }

                String timeDate = timeY + timeM + timeD;
                String timeS = timeSH + timeSMin;
                String timeE = timeEH + timeEMin;
                frame.setScheduleDateTime(Integer.parseInt(timeDate));
                frame.setStartTime(timeS);
                boolean check = frame.setEndTime(timeE);
                frame.setScheduleText(jTextField.getText());

                if (check == false||frame.index>=24){
                    if (frame.index>=24){
                        JFrame notice = new JFrame("Notice");
                        notice.setSize(250,100);
                        notice.setLocationRelativeTo(null);
                        notice.getContentPane().setBackground(Color.WHITE);
                        notice.setLayout(null);
                        JLabel label = new JLabel("行程超出目前可增加數目");
                        label.setBounds(30,0,200,40);
                        label.setFont(new Font("",Font.BOLD,14));
                        notice.add(label);
                        notice.setVisible(true);
                    }else{
                        JFrame notice = new JFrame("Notice");
                        notice.setSize(250,100);
                        notice.setLocationRelativeTo(null);
                        notice.getContentPane().setBackground(Color.WHITE);
                        notice.setLayout(null);
                        JLabel label = new JLabel("重複時間,請重新填寫");
                        label.setBounds(50,0,200,40);
                        label.setFont(new Font("",Font.BOLD,14));
                        notice.add(label);
                        notice.setVisible(true);
                    }
                }else{
                    JFrame notice = new JFrame("Notice");
                    notice.setSize(250,150);
                    notice.setLocationRelativeTo(null);
                    notice.getContentPane().setBackground(Color.WHITE);
                    notice.setLayout(null);
                    JLabel jLabel = new JLabel("已排入行程表");
                    jLabel.setBounds(10,0,200,20);
                    jLabel.setFont(new Font("",Font.BOLD,14));
                    JLabel jLabel1 = new JLabel(frame.textArray[frame.index-1]);
                    jLabel1.setBounds(10,20,200,40);
                    jLabel1.setFont(new Font("",Font.BOLD,12));
                    JLabel jLabel2 = new JLabel(Integer.toString(frame.timeArray[frame.index-1]));
                    jLabel2.setBounds(10,40,200,40);
                    jLabel2.setFont(new Font("",Font.BOLD,12));
                    JLabel jLabel3 = new JLabel(frame.timeSArray[frame.index-1]);
                    jLabel3.setBounds(10,60,200,40);
                    jLabel3.setFont(new Font("",Font.BOLD,12));
                    JLabel jLabel4 = new JLabel(frame.timeEArray[frame.index-1]);
                    jLabel4.setBounds(50,60,200,40);
                    jLabel4.setFont(new Font("",Font.BOLD,12));
                    JLabel jLabel5 = new JLabel("~");
                    jLabel5.setBounds(40,60,10,40);
                    jLabel5.setFont(new Font("",Font.BOLD,12));

                    notice.add(jLabel);
                    notice.add(jLabel1);
                    notice.add(jLabel2);
                    notice.add(jLabel3);
                    notice.add(jLabel4);
                    notice.add(jLabel5);

                    JButton btn = new JButton("進行分類");
                    btn.setBounds(120,20,100,20);
                    notice.add(btn);
                    JButton btn1 = new JButton("不進行分類");
                    btn1.setBounds(120,60,100,20);
                    notice.add(btn1);

                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            notice.setVisible(false);
                            JFrame typeJF = new JFrame("Type");
                            typeJF.setSize(250,150);
                            typeJF.setLocationRelativeTo(null);
                            typeJF.getContentPane().setBackground(Color.WHITE);
                            typeJF.setLayout(null);
                            String[] typebox = {"上班","上課","其它"};
                            JComboBox typeComboBox = new JComboBox(typebox);
                            typeComboBox.setBounds(70,10,100,20);
                            typeJF.add(typeComboBox);
                            JButton btn = new JButton("確定");
                            btn.setBounds(80,50,80,30);
                            typeJF.add(btn);
                            btn.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setType(typeComboBox.getSelectedItem().toString());
                                    typeJF.setVisible(false);
                                    JFrame repeatJF = new JFrame("Repeat");
                                    repeatJF.setSize(250,150);
                                    repeatJF.setLocationRelativeTo(null);
                                    repeatJF.getContentPane().setBackground(Color.WHITE);
                                    repeatJF.setLayout(null);
                                    JLabel jLabel6 = new JLabel("重複次數:");
                                    jLabel6.setBounds(20,10,100,30);
                                    jLabel6.setFont(new Font("",Font.BOLD,14));
                                    repeatJF.add(jLabel6);
                                    String[] repeate = new String[22];
                                    for (int i = 0;i<22;i++){
                                        repeate[i] = Integer.toString(i);
                                    }

                                    JComboBox repeateComboBox = new JComboBox(repeate);
                                    repeateComboBox.setBounds(100,15,100,20);
                                    repeatJF.add(repeateComboBox);

                                    JButton btn = new JButton("顯示最終顯示最終行程表");
                                    btn.setBounds(20,50,200,30);
                                    repeatJF.add(btn);
                                    btn.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                        for(int i =0;i<Integer.parseInt(repeateComboBox.getSelectedItem().toString());i++){
                                            frame.repeatSchedule();
                                        }
                                        repeatJF.setVisible(false);
                                        for (int i=0;frame.timeArray[i]!=-1;i++){
                                            System.out.println(frame.timeArray[i]);
                                        }
                                        printSchedule.print();
                                    }
                                });
                                repeatJF.setVisible(true);
                                }
                            });
                            typeJF.setVisible(true);
                        }
                    });

                    btn1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            notice.setVisible(false);
                            frame.setType("無");//不加可能會錯誤
                            JFrame repeatJF = new JFrame("Repeat");
                            repeatJF.setSize(250,150);
                            repeatJF.setLocationRelativeTo(null);
                            repeatJF.getContentPane().setBackground(Color.WHITE);
                            repeatJF.setLayout(null);
                            JLabel jLabel6 = new JLabel("重複次數:");
                            jLabel6.setBounds(20,10,100,30);
                            jLabel6.setFont(new Font("",Font.BOLD,14));
                            repeatJF.add(jLabel6);
                            String[] repeate = new String[22];
                            for (int i = 0;i<22;i++){
                                repeate[i] = Integer.toString(i);
                            }

                            JComboBox repeateComboBox = new JComboBox(repeate);
                            repeateComboBox.setBounds(100,15,100,20);
                            repeatJF.add(repeateComboBox);

                            JButton btn = new JButton("顯示最終顯示最終行程表");
                            btn.setBounds(20,50,200,30);
                            repeatJF.add(btn);
                            btn.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    for(int i =0;i<Integer.parseInt(repeateComboBox.getSelectedItem().toString());i++){
                                        frame.repeatSchedule();
                                    }
                                    repeatJF.setVisible(false);
                                    for (int i=0;frame.timeArray[i]!=-1;i++){
                                        System.out.println(frame.timeArray[i]);
                                    }
                                    printSchedule.print();
                                }
                            });

                            repeatJF.setVisible(true);
                        }
                    });


                    notice.setVisible(true);
                }
            }
        });

        JButton open = new JButton("Schedule");
        open.setBounds(260,10,90,30);
        jframe2.add(open);
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printSchedule.print();
            }
        });

        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe2.setVisible(true);
    }
}
