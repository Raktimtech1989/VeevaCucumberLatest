package stepdefinition;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.When; 
import io.cucumber.java.en.Then; 

public class STEPS_CPProduct {
	

	
	@Given("^I successfully setup the CP Product$")
    public void setupCPProduct() {
        // Your implementation for setting up CP Product
		
		System.out.println("implemented");
    }

    @Given("^I click on the X Icon$")
    public void clickXIcon() {
        // Your implementation for clicking X Icon
    	System.out.println("implemented");
    }

    @When("^I click on the menu time News Features section$")
    public void clickNewsAndFeatures() {
        // Your implementation for clicking News & Features section
    	System.out.println("implemented");
    }

    @Then("^I should be successfully navigated into CP Product home page$")
    public void verifyHomePageNavigation() {
        // Your implementation for verifying home page navigation
    	System.out.println("implemented");
    }

    @Then("^I should be able to navigate into CP Product News Article sectrion page$")
    public void verifyNewsAndArticlePageNavigation() {
        // Your implementation for verifying News & Article page navigation
    	System.out.println("implemented");
    }

    @Then("^I should be able to count the total number of Vidoes feed$")
    public void countTotalVideosFeed() {
        // Your implementation for counting total videos feed
    	System.out.println("implemented");
    }

    @Then("^I should be able to count the videos feed with filtered criteria$")
    public void countVideosFeed() {
        // Your implementation for counting videos feed with given criteria
    }

}


