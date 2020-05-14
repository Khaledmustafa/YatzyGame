import java.util.Random;

public class Dice {

    Random random = new Random();

    public int throwDice() {
        //TODO code throw dice

        int result = random.nextInt(1-6);
        return result;
    }

    public void throwAllDice() {
        //TODO code throw all dices
    }

    public void saveDice() {
        //TODO create code to save dice
    }
}
