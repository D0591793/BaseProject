package com.github.ych861031;

import java.util.Calendar;

public class getCalender {

    Calendar calendar = Calendar.getInstance();
    public int getdate(){
         return calendar.get(Calendar.DATE);
    }

    public int getmonth(){
        return calendar.get(Calendar.MONTH);
    }

    public int getyear(){
        return calendar.get(Calendar.YEAR);
    }



}
