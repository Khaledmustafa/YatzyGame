import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    private int expected;
    private int actual;

    @Before
    public void setUp() throws Exception {
        Dice dice = new Dice();
    }

    @Test
    public void throwDice() {
        expected = 1;
        actual = dice.throwDice();
        assertEquals(expected,actual);
    }

    @Test
    public void throwAllDice() {
    }

    @Test
    public void saveDice() {
    }
}