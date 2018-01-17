package com.github.ych861031;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class getCalender {

    Calendar calendar = Calendar.getInstance();
    public int getdate(){
         return calendar.get(Calendar.DATE);
    }

    DateFormat df = new SimpleDateFormat("yyyyMMdd");
    String formattedDate = df.format(new java.util.Date());

    public int getAllDate(){
        return Integer.parseInt(formattedDate);
    }

    public int getmonth(){
        System.out.println(Calendar.getInstance());
        return calendar.get(Calendar.MONTH);
    }

    public int getyear(){
        return calendar.get(Calendar.YEAR);
    }



}
