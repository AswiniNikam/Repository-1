package com.sample.HelloWolrdApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testGetHello() {
        assertEquals("Hello, World!", App.getHello());
    }
   
}
