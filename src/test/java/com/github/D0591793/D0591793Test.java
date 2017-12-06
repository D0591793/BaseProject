package com.github.D0591793;

import org.junit.Test;

import static org.junit.Assert.*;

public class D0591793Test {
    @Test
    public void main() throws Exception {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }


    }

}
