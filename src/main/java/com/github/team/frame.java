package com.github.team;
import com.github.D0512797.temp;
import com.github.D0591793.addAnotherSchedule;
import com.github.jay87406.setOnlineExpert;
import com.github.ych861031.checkSchedule;
import com.github.ych861031.setSchedule;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class frame implements ActionListener {
    private static JFrame jframe;
    private static JFrame jframe2;
    public static int index = 0;

    public frame(JFrame jframe,JFrame jframe2) {
        this.jframe = jframe;
        this.jframe2 = jframe2;
    }

    public static void main(String[] args){

        /*set frame*/
        jframe = new JFrame();
        jframe.setSize(375,640);
        jframe.setLocationRelativeTo(null);

        /*get contentpane and set background*/
        jframe.getContentPane().setBackground(Color.white);
        jframe.setLayout(null);

        /*set title*/
        JLabel label = new JLabel("時間管理");
        label.setBounds(120,100,200,50);
        label.setFont(new Font("",Font.BOLD, 32));
        jframe.add(label);

        /*set button*/
        JButton btn1 = new JButton("排入上班課行程");
        btn1.setBounds(110,200,150,25);
        jframe.add(btn1);

        JButton btn2 = new JButton("自動規劃娛樂活動");
        btn2.setBounds(110,250,150,25);
        jframe.add(btn2);

        JButton btn3 = new JButton("鬧鐘");
        btn3.setBounds(110,300,150,25);
        jframe.add(btn3);

        JButton btn4 = new JButton("在線專家");
        btn4.setBounds(110,350,150,25);
        jframe.add(btn4);

        JButton btn5 = new JButton("排入其他待辦事項");
        btn5.setBounds(110,400,150,25);
        jframe.add(btn5);



        /*new 的後面改成自己的class*/
        btn1.addActionListener(new setSchedule(jframe));
        btn2.addActionListener(new temp(jframe));
        btn3.addActionListener(new setSchedule(jframe));
        btn4.addActionListener(new setOnlineExpert(jframe));
        btn5.addActionListener(new addAnotherSchedule(jframe));


        /*!!!!!important!!!!*/
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        /*close frame2*/
        jframe2.dispose();
        System.out.println(e);

        /*get frame2 x,y and set frame1 x,y*/
        jframe.setLocation(jframe2.getLocation());

        /*let frame1 can see*/
        jframe.setVisible(true);

    }

    public static int[] timeArray = new int[100];

    public static void setScheduleDateTime(int time){
        System.out.println(index);
        timeArray[frame.index++] = time;
        System.out.println(time);
        timeArray[index] = -1;
    }

    public static String[] textArray = new String[100];
    public static void setScheduleText(String text){
        int index2 = index-1;
        textArray[index2] = text;
        System.out.println( textArray[index2]);
    }
    public static String[] timeSArray = new String[100];
    public static void setStartTime(String time){
        int index2 = index-1;
        timeSArray[index2] = time;
        System.out.print( timeSArray[index2] + "~");
    }

    public static String[] timeEArray = new String[100];
    public static boolean setEndTime(String time){
        int index2 = index-1;
        timeEArray[index2] = time;
        System.out.println( timeEArray[index2]);
        boolean check = checkSchedule.check(index2);
        return check;
    }

    public static String[] typeArray = new String[100];
    public static void setType(String type){
        int intdex2 = index-1;
        typeArray[intdex2] = type;
        System.out.println(type);
    }

    public static void repeatSchedule(){
        int date = frame.timeArray[index-1]%100;
        int year = frame.timeArray[index-1]/10000;
        int month = frame.timeArray[index-1]/100-(year*100);

        if (year%4!=0){
            if (month == 2){
                if (date+7 >= 28){
                    month++;
                    date = date+7-28;
                }else {
                    date+=7;
                }
            }else if(month == 4||month==6||month==9 ||month==11){
                if (date+7 >= 30){
                    month++;
                    date = date+7-30;
                }else{
                    date+=7;
                }
            }else{
                if (date+7 >= 31){
                    month++;
                    date = date+7-31;
                }else{
                    date+=7;
                }
            }
        }else{
            if (month == 2){
                if (date+7 >= 29){
                    month++;
                    date = date+7-29;
                }else {
                    date+=7;
                }
            }else if(month == 4||month==6||month==9 ||month==11){
                if (date+7 >= 30){
                    month++;
                    date = date+7-30;
                }else{
                    date+=7;
                }
            }else{
                if (date+7 >= 31){
                    month++;
                    date = date+7-31;
                }else{
                    date+=7;
                }
            }
        }
        if (month>12){
            month-=12;
            year++;
        }
        String time1 = Integer.toString(month);
        if (month<10){
            time1 = "0"+ time1;
        }
        String time2 = Integer.toString(date);
        if (date<10){
            time2 = "0"+ time2;
        }
        String time = Integer.toString(year);
        time = time + time1 +time2;
        timeArray[frame.index] = Integer.parseInt(time);
        timeSArray[frame.index] = frame.timeSArray[index-1];
        timeEArray[frame.index] = frame.timeEArray[index-1];
        textArray[frame.index] = frame.textArray[index-1];
        typeArray[frame.index] = frame.typeArray[index-1];
        timeArray[++index] = -1;

    }

    public int covergeTest(int a){
        return 1;
    }
}

