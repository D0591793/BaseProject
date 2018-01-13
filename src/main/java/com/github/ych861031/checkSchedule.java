package com.github.ych861031;

import com.github.team.frame;

public class checkSchedule {
    public static int a[] = frame.timeArray;
    public static String b[] = frame.timeSArray;
    public static String c[] = frame.timeEArray;

    public static boolean check(int index){
        for (int i = 0;i< index;i++){
            if(a[i]==a[index]&&b[i].equals(b[index])&& c[i].equals(c[index])){
                System.out.println("重複將重置");
                a[index]=-1;
                frame.index--;
                return false;
            }
            if (a[i] == -1){
                break;
            }
        }
        return true;
    }


}
