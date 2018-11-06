package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

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
        boolean result = app.assess(50);
        assertTrue(result);
    }

    @Test
    public void testAssess2() {
        boolean result = app.assess(0);
        assertFalse(result);
    }

    @Test
    public void testAssess3() {
        boolean result = app.assess(80);
        assertTrue(result);
    }

    /*
     * @Test
     * 
     * public void testGrade1() { String result = app.grade(100) assertEquals("A",
     * result); }
     */
}
