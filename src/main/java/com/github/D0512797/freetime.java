package com.github.D0512797;

import com.github.team.frame;
import com.github.ych861031.getCalender;
import com.github.ych861031.printSchedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

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

        JLabel label3 = new JLabel(Integer.toString(temp.freetimes)+"分鐘");
        label3.setBounds(120,53,200,50);
        label3.setFont(new Font("", Font.BOLD, 16));
        jFrame.add(label3);







        int i =0;
        String[] array = new String[10];
        if(temp.freetimes < 10)
        {
            JLabel labe21 = new JLabel("你的時間太少了啦!");
            labe21.setBounds(90,110,200,35);
            labe21.setFont(new Font("",Font.BOLD,20));
            jFrame.add(labe21);

            JLabel labe22 = new JLabel("時間要大於10分鐘");
            labe22.setBounds(110,150,200,35);
            labe22.setFont(new Font("",Font.BOLD,14));
            jFrame.add(labe22);

        }
        else if(temp.freetimes >= 10)
        {
            JLabel labe14 = new JLabel("挑一個喜歡的吧!");
            labe14.setBounds(90,110,200,25);
            labe14.setFont(new Font("", Font.BOLD, 20));
            jFrame.add(labe14);
        }
        if(temp.freetimes>=10) {
                array[i++] = "看一個笑話";
                array[i++] = "放一首新歌";
            if (temp.freetimes>=30){
                array[i++] = "玩小遊戲";
                array[i++] = "播短片";
                if (temp.freetimes>=60){
                    array[i++] ="吃美食";
                    array[i++] ="打籃球";
                    array[i++] ="小睡";
                    if(temp.freetimes>=120) {
                        array[i++] ="看電影";
                        array[i++] ="逛街";
                        array[i++] ="附近的景點";

                    }

                }

            }
        }

        JLabel[] a =new JLabel[10];
        JButton[] b =new JButton[10];

        for (int j=0;j<i;j++){
            a[j] = new JLabel(Integer.toString(j+1)+". "+array[j]);
            a[j].setBounds(20,j*40+160,200,30);
            a[j].setFont(new Font("", Font.BOLD, 20));
            jFrame.add(a[j]);

            b[j] = new JButton("排入行程");
            b[j].setBounds(180,j*40+160,100,25);
            jFrame.add(b[j]);

        }
        if(i > 0) {
            b[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();

                    frame.setScheduleDateTime(g.getAllDate());
                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);


                    frame.setScheduleText("看一個笑話");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }

        if(i > 1) {
            b[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("放一首新歌");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }

        if(i > 2) {
            b[2].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("玩小遊戲");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }

        if(i > 3 ) {
            b[3].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("播短片");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }

        if(i > 4){
            b[4].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("吃美食");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }
        if(i > 5) {

            b[5].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("打籃球");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }
        if(i > 6) {
            b[6].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("小睡");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }
        if(i > 7) {
            b[7].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("看電影");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }
        if(i > 8) {
            b[8].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("逛街");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);

                }
            });
        }
        if(i > 9) {
            b[9].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getCalender g = new getCalender();
                    String CAL = Integer.toString(g.getyear()) + Integer.toString(g.getmonth()) + Integer.toString(g.getdate());
                    frame.setScheduleDateTime(Integer.parseInt(CAL));

                    frame.setStartTime(temp.start);
                    frame.setEndTime(temp.end);
                    frame.setScheduleText("附近的景點");
                    frame.setType("娛樂");
                    jFrame.setVisible(false);
                }
            });
        }

        JLabel labe11 = new JLabel("空閒時間:");
        labe11.setBounds(20,65,200,25);
        labe11.setFont(new Font("", Font.BOLD, 20));
        jFrame.add(labe11);


        jFrame.setVisible(true);
    }
}
