package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sample2muldta {

    @Given("enter {string}")
    public void enter(String string) {
        System.out.println(string);
    }
    @Then("get text")
    public void get_text() {

    }
}
