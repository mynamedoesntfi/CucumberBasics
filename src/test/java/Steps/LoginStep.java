package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("I navigate to the login page");
    }

    @And("^I enter the username and password$")
    public void iEnterTheUsernameAndPassword(DataTable table) {

        List<User> users = table.asList(User.class);

        for (User user :
                users) {
            System.out.println("Username - " + user.username);
            System.out.println("Password - " + user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }
}

