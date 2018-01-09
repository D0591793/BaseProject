package com.github.asd0591804;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testTest {

    test a = new test();


    @Test
    public void testtest() {
        assertEquals(2,a.t(1));
    }
    public void testtest2() {
        assertEquals(3,a.t(2));
    }

    public void test3(){
        assertEquals(1,a.covertest(1));
    }

}
