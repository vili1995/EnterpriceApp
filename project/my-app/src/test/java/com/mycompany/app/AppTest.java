package com.mycompany.app;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app;

    @Before
    public void setup() {
        app = new App();
    }
    
    @Test
    public void case1() {
        int x = 10;
        int y = 20;
        int z = x + y;
        assertTrue(z == 30);
    }

    @Test
    public void testAssess1() {
        App app = new App();
        boolean result = app.assess(50);
        assertTrue(result);
    }

    @Test
    public void testAssess2() {
        App app = new App();
        boolean result = app.assess(0);
        assertFalse(result);
    }

    @Test
    public void testAssess3() {
        App app = new App();
        boolean result = app.assess(80);
        assertTrue(result);
    }

    
}

