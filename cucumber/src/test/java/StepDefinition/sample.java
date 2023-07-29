package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sample {

    @Given("open the {string}")
    public void open_the(String string) {
        System.out.println("opening the browser");

    }
    @Then("Enter data in search field")
    public void enter_data_in_search_field() {

        System.out.println("enter data which has to be searched");
    }
    @And("click on search button")
    public void click_on_search_button() {

        System.out.println("clcik on the button");
    }
    @Then("verify is it going to the new page")
    public void verify_is_it_going_to_the_new_page() {
        System.out.println("verify function");
    }



}
