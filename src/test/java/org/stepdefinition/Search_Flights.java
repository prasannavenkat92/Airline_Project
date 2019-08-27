package org.stepdefinition;

import org.objectrepository.HomePage;
import org.openqa.selenium.WebElement;
import org.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Flights extends HomePage{
	
	@Given("user must be in air dolomoti home page")
	public void user_must_be_in_air_dolomoti_home_page() {
	    launchURL("https://www.airdolomiti.eu/");
	}

	@When("user should give all details")
	public void user_should_give_all_details() {
	   HomePage home=new HomePage();
	   WebElement accept=objFind("id", "explicitsubmit");
	   button(accept);
	   button(home.getOneWayTripOption());
	   selectByText(home.getDepartureLocation(), "Bari");
	   selectByText(home.getDestinationLocation(), "Munich");
	}

	@When("user should click search flights")
	public void user_should_click_search_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user should get list of flights")
	public void user_should_get_list_of_flights() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
