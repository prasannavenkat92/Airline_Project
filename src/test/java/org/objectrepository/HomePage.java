package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "booking_trip_type_r")
	private WebElement roundTripOption;

	private WebElement oneWayTripOption;

	private WebElement departureLocation;

	private WebElement destinationLocation;

	public WebElement getRoundTripOption() {
		return roundTripOption;
	}

	public WebElement getOneWayTripOption() {
		return oneWayTripOption;
	}

	public WebElement getDepartureLocation() {
		return departureLocation;
	}

	public WebElement getDestinationLocation() {
		return destinationLocation;
	}

}
