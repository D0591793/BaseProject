package com.github.team;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class frameTest {


    frame a = new frame(null,null);

    @Test
    public void covergeTest() {
        assertEquals(1,a.covergeTest(1));
    }

}
