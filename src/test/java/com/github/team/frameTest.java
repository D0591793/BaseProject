package com.github.team;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class frameTest {


    JFrame jframe = new JFrame();
    JFrame jframe2 = new JFrame();

    frame a = new frame(jframe,jframe2);
    @Test
    public void covergeTest() {
        assertEquals(1,a.covergeTest(1));
    }
}
