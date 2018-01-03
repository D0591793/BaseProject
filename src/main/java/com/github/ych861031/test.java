package com.github.ych861031;


import javax.swing.*;
import java.awt.*;


public class test {
    public static void main(String[] args){
        // 建立一個視窗，並將標題設定為「視窗程式」
        // 標題可用jframe.setTitle("視窗程式");代替
        JFrame jframe = new JFrame("視窗程式");
        // 設定圖示
        jframe.setIconImage(jframe.getToolkit().getImage("test.jpg"));

        // 設定視窗大小(長,寬)
        jframe.setSize(350, 640);
        jframe.setBackground(Color.blue);

        // 設定視窗開啟時的位置，有以下兩種常用設定方法
        jframe.setLocation(0,0); // --> 設定視窗開啟時左上角的座標，也可帶入Point物件
        jframe.setLocationRelativeTo(null); // --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟


        // 關閉選項(右上角的叉叉圖示)按下後的動作
        // EXIT_ON_CLOSE：點選關閉時，關閉程式
        // DISPOSE_ON_CLOSE：點選關閉時，關閉顯示的視窗以及使用的資源，程式仍在背景執行
        // HIDE_ON_CLOSE：點選關閉時，僅隱藏顯示的視窗，程式仍在背景執行
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 設定視窗顯示，若未設定視窗只會在背景執行
        jframe.setVisible(true);


//        jframe.getContentPane().setLayout(new GridLayout(3,2));
//        Button button1 = new Button("Button1");
//        Button button2 = new Button("Button2");
//        Button button3 = new Button("Button3");
//        Button button4 = new Button("Button4");
//        Button button5 = new Button("Button5");



    }

}
