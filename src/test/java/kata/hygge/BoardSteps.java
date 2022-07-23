package kata.hygge;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BoardSteps {
    private GameOfLifeEngine engine;

    public BoardSteps() {
        this.engine = new GameOfLifeEngine()
    }

    @Given("no startup position")
    public void no_startup_position() {
      this.engine.initialise();
    }
    @When("a game is started")
    public void a_game_is_started() {
        // Write code here that turns the phrase above into concrete actions
        this.engine.start();
    }
    @Then("the game initializes correctly")
    public void the_game_initializes_correctly() {
        // Write code here that turns the phrase above into concrete actions
        this.engine.status();
    }


}
