import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    // Asserting True
    // All combinations
    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(5, 4, 3));
    }

    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(4, 5, 3));
    }

    @Test
    public void test_is_triangle_4() {
        assertTrue(Demo.isTriangle(5, 3, 4));
    }

    @Test
    public void test_is_triangle_5() {
        assertTrue(Demo.isTriangle(3, 5, 4));
    }

    @Test
    public void test_is_triangle_6() {
        assertTrue(Demo.isTriangle(4, 3, 5));
    }

    // Decimals
    @Test
    public void test_is_triangle_7() {
        assertTrue(Demo.isTriangle(0.5, 0.7, 0.6));
    }

    @Test
    public void test_is_triangle_8() {
        assertTrue(Demo.isTriangle(0.00000000007, 0.00000000005, 0.00000000006));
    }

    @Test
    public void test_is_triangle_9() {
        assertTrue(Demo.isTriangle(0.007, 0.005, 0.006));
    }

    @Test
    public void test_is_triangle_10() {
        assertTrue(Demo.isTriangle(0.5, 1, 0.6));
    }

    @Test
    public void test_is_triangle_11() {
        assertTrue(Demo.isTriangle(0.5, 0.6, 1));
    }

    @Test
    public void test_is_triangle_12() {
        assertTrue(Demo.isTriangle(1, 0.6, 0.5));
    }

    @Test
    public void test_is_triangle_13() {
        assertTrue(Demo.isTriangle(1, 0.5, 0.6));
    }

    @Test
    public void test_is_triangle_14() {
        assertTrue(Demo.isTriangle(0.6, 1, 0.5));
    }

    @Test
    public void test_is_triangle_15() {
        assertTrue(Demo.isTriangle(0.6, 0.5, 1));
    }

    // Large numbers
    @Test
    public void test_is_triangle_16() {
        assertTrue(Demo.isTriangle(1000000000, 999999998, 999999995));
    }

    @Test
    public void test_is_triangle_17() {
        assertTrue(Demo.isTriangle(999999995, 1000000000, 999999998));
    }

    @Test
    public void test_is_triangle_18() {
        assertTrue(Demo.isTriangle(999999998, 999999995, 1000000000));
    }

    @Test
    public void test_is_triangle_19() {
        assertTrue(Demo.isTriangle(999999995, 999999998, 1000000000));
    }

    @Test
    public void test_is_triangle_20() {
        assertTrue(Demo.isTriangle(999999998, 1000000000, 999999995));
    }

    @Test
    public void test_is_triangle_21() {
        assertTrue(Demo.isTriangle(1000000000, 999999995, 999999998));
    }

    // All equal numbers
    @Test
    public void test_is_triangle_22() {
        assertTrue(Demo.isTriangle(3, 3, 3));
    }

    @Test
    public void test_is_triangle_23() {
        assertTrue(Demo.isTriangle(1, 1, 1));
    }

    @Test
    public void test_is_triangle_24() {
        assertTrue(Demo.isTriangle(999999999, 999999999, 999999999));
    }

    @Test
    public void test_is_triangle_25() {
        assertTrue(Demo.isTriangle(0.007, 0.007, 0.007));
    }

    @Test
    public void test_is_triangle_26() {
        assertTrue(Demo.isTriangle(0.0000000000000001, 0.0000000000000001, 0.0000000000000001));
    }


    // Asserting False
    // When using 0
    @Test
    public void test_is_NOT_triangle_1() {
        assertFalse(Demo.isTriangle(0,0,0));
    }

    @Test
    public void test_is_NOT_triangle_2() {
        assertFalse(Demo.isTriangle(1000000000,0,999999999));
    }

    @Test
    public void test_is_NOT_triangle_3() {
        assertFalse(Demo.isTriangle(1000,999,0));
    }

    @Test
    public void test_is_NOT_triangle_4() {
        assertFalse(Demo.isTriangle(0,1000,999));
    }

    @Test
    public void test_is_NOT_triangle_5() {
        assertFalse(Demo.isTriangle(1000,0,999));
    }

    // Negative numbers
    @Test
    public void test_is_NOT_triangle_6() {
        assertFalse(Demo.isTriangle(-3,-4,-5));
    }

    @Test
    public void test_is_NOT_triangle_7() {
        assertFalse(Demo.isTriangle(-5,-3,-4));
    }

    @Test
    public void test_is_NOT_triangle_8() {
        assertFalse(Demo.isTriangle(-4,-5,-3));
    }

    @Test
    public void test_is_NOT_triangle_9() {
        assertFalse(Demo.isTriangle(-5,-4,-3));
    }

    @Test
    public void test_is_NOT_triangle_10() {
        assertFalse(Demo.isTriangle(-4,-3,-5));
    }

    // Decimals
    @Test
    public void test_is_NOT_triangle_11() {
        assertFalse(Demo.isTriangle(0.5,0.1,0.9));
    }

    @Test
    public void test_is_NOT_triangle_12() {
        assertFalse(Demo.isTriangle(0.1,0.09,-0.99));
    }

    @Test
    public void test_is_NOT_triangle_13() {
        assertFalse(Demo.isTriangle(0.1,0.09,0.99));
    }

    // Test if any two sides are equal to the third
    @Test
    public void test_is_NOT_triangle_14() {
        assertFalse(Demo.isTriangle(5,12,7));
    }

    @Test
    public void test_is_NOT_triangle_15() {
        assertFalse(Demo.isTriangle(12,5,7));
    }

    @Test
    public void test_is_NOT_triangle_16() {
        assertFalse(Demo.isTriangle(7,12,5));
    }

    @Test
    public void test_is_NOT_triangle_17() {
        assertFalse(Demo.isTriangle(7,5,12));
    }

    @Test
    public void test_is_NOT_triangle_18() {
        assertFalse(Demo.isTriangle(5,7,12));
    }

    @Test
    public void test_is_NOT_triangle_19() {
        assertFalse(Demo.isTriangle(12,7,5));
    }

    @Test
    public void test_is_NOT_triangle_20() {
        assertFalse(Demo.isTriangle(4,8,4));
    }

    // Test main()
    @Test
    public void test_main_1() {
        String input = "3" + System.getProperty("line.separator");
        input += "4" + System.getProperty("line.separator");
        input += "5" + System.getProperty("line.separator");

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void test_main_2() {
        String input = "994" + System.getProperty("line.separator");
        input += "995" + System.getProperty("line.separator");
        input += "993" + System.getProperty("line.separator");

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void test_main_3() {
        String input = "3" + System.getProperty("line.separator");
        input += "4" + System.getProperty("line.separator");
        input += "0" + System.getProperty("line.separator");

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void test_main_4() {
        String input = "3" + System.getProperty("line.separator");
        input += "-4" + System.getProperty("line.separator");
        input += "5" + System.getProperty("line.separator");

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
}
