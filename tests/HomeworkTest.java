import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTest {

    @Test
    public void abcTest1() {
        boolean result = Homework.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = Homework.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = Homework.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result = Homework.abcTest("");
        assertEquals(false, result);
    }

    @Test
    public void alternateStrings1() {
        String result = Homework.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result = Homework.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStrings3() {
        String result = Homework.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStrings4() {
        String result = Homework.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStrings5() {
        String result = Homework.alternateStrings("", "");
        assertEquals("", result);
    }
}