import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    private int expected;
    private int actual;


    @Test
    public void throwDice() {
        Dice dice = new Dice();
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