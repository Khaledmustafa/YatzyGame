import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    Dice dice;

    @When("I create a Dice")
    public void iCreateADice() {
        dice = new Dice();
    }

    @Given("I Start a game of Yatzy")
    public void iStartAGameOfYatzy() {
        YatzyGame game = new YatzyGame();
    }

    @And("I choose to throw dice")
    public void iChooseToThrowDice() {
        dice.throwDice();
    }

    @Then("i should throw all the dices")
    public void iShouldThrowAllTheDices() {
        dice.throwAllDice();
    }

    @Then("I should be able to save dices")
    public void iShouldBeAbleToSaveDices() {
        dice.saveDice();
    }
}
