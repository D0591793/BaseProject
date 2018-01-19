package com.github.jay87406;

import com.github.team.frame;
import com.github.ych861031.printSchedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class type implements ActionListener {
    private JFrame jFrame;
    private JFrame jFrame3;

    public static int index = 0;
    JTextField confirm = new JTextField("0");
    JTextField txtArea = new JTextField();

    public type(JFrame jFrame,JFrame jframe2){
        this.jFrame = jframe2; //第二頁
        this.jFrame3 = jFrame;//原本的第一頁

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*隱藏前一頁*/
        jFrame.setVisible(false);

        /*設$此頁*/
        JFrame jframe2 = new JFrame();//新增物件
        jframe2.setSize(375,640);//大小
        jframe2.setLocation(jFrame.getLocation());//取得前一頁位置
        jframe2.getContentPane().setBackground(Color.white);//背景顏色
        jframe2.setLayout(null);//用座標排版

        /*set Label*/
        JLabel label = new JLabel("線上問答");//標題
        label.setBounds(130,0,200,50);//座標 長寬
        label.setFont(new Font("", Font.BOLD, 20));//字型
        jframe2.add(label);//加入畫面中


        /*set button*/
        JButton btn = new JButton("返回");//按鈕物件
        btn.setBounds(20,10,60,30);
        jframe2.add(btn);

        btn.addActionListener(new setOnlineExpert(jFrame3));//47~53都要 這裡的jFrame3是原本的第一頁
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.ansIndex=-1;
                jframe2.dispose();
            }
        });




/*
        //這個只是示範
        JButton delete = new JButton("delete");
        delete.setBounds(260,10,80,30);
        jframe2.add(delete);

        //下面是偵測這顆按鈕 他要做的事要在裡面寫
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //這裡
              //
                //  String input=JOptionPane.showInputDialog(null,"請輸入:","輸入對話框",JOptionPane.QUESTION_MESSAGE);
                String input=JOptionPane.showInputDialog("請輸入姓名");
                JOptionPane.showMessageDialog(null,"您輸入的是 : " + input);
            }
        });*/



//        JTextField jTextField = new JTextField();
//        jTextField.setBounds(60,60,240,440);
//        jframe2.add(jTextField);

        JButton confirm = new JButton("開始提問");
        confirm.setBounds(135,520,110,28);
        jframe2.add(confirm);


        JLabel jLabel= new JLabel("本次提問紀錄");
        jLabel.setBounds(50,30,100,40);
        jLabel.setFont(new Font("",Font.BOLD,14));
        jframe2.add(jLabel);








        JLabel[] jLabels = new JLabel[24];
        for (int i=0;i<24;i++ ){

            jLabels[i] = new JLabel();
            jLabels[i].setFont(new Font("",Font.BOLD,14));
            jLabels[i].setBounds(50,i*15+60,100,20);
            jLabels[i].setForeground(Color.WHITE);
            jframe2.add(jLabels[i]);



        }



        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++frame.ansIndex;
                String input=JOptionPane.showInputDialog("請輸入問題");
                JOptionPane.showMessageDialog(null,"所提出問題: " + input);
                JOptionPane.showMessageDialog(null,"問題已發送請等待回應");



                jLabels[frame.ansIndex].setForeground(Color.BLACK);
                jLabels[frame.ansIndex].setText(input);



                //這裡
               /*String area;
                area = jTextField.getText(); //獲取值
                String stArea = String.valueOf(area);
                txtArea.setText("獲取值為： " + stArea );*/
                /*String a = jTextField.getText();
                JLabel jLabel1 = new JLabel(a);
                jLabel1.setBounds(30,50,80,20);
                jLabel1.setFont(new Font("",Font.BOLD,14));
                jframe2.add(jLabel1);

               /* JLabel labe3 = confirm.setText();
                labe3.setBounds(30,50,80,20);//座標 長寬
                labe3.setFont(new Font("", Font.BOLD, 14));//字型
                jframe2.add(labe3);//加入畫面中*/
            }
        });


        // String input=JOptionPane.showInputDialog(null,"請輸入:","輸入對話框",JOptionPane.QUESTION_MESSAGE);


        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//案關閉全部關掉

        jframe2.setVisible(true);//讓此頁顯示
    }
}
