import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static java.lang.System.out;
import cucumber.api.java8.*;

public class calculator_steps {
    @Given("^the input$")
    public String the_input(String numbers){
        numbers = "1+3";
        return numbers;
    }
    @When("^the calculate is run$")
    public void the_calculate_is_run(){
       out.println("the calculate is running");
    }calculator_steps
    @Then("^the output should be 4$")
    public void the_output_should_be(){
        out.println("4");
    }
}
