package pl.edu.pjatk.tau.piotr;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest
{
    App app;

    @Before
    public void init() {
        app = new App();
    }

    @Test
    public void addCheck() {
        double add = app.add(2, 2);
        assertEquals(4, add, 0.001);
    }
}
