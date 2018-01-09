package com.github.team;

import com.github.ych861031.setSchedule;
import org.junit.Test;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;

public class frameTest{




    JFrame jframe = new JFrame();
    JFrame jframe2 = new JFrame();
    frame a = new frame(jframe,jframe2);
    @Test
    public void covergeTest(){
        assertEquals(1,a.covergeTest(1));
    }


}
