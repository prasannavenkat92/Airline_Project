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

	@FindBy(id="booking_trip_type_o")
	private WebElement oneWayTripOption;

	@FindBy(id="select2-chosen-1")
	private WebElement departureLocation;

	@FindBy(id="select2-chosen-2")
	private WebElement destinationLocation;
	
	@FindBy(id="datepicker-from")
	private WebElement departureDate;
	
	@FindBy(id="datepicker-to")
	private WebElement returnDate;
	
	@FindBy(id="booking_flexible")
	private WebElement flexibleDates;
	
	@FindBy(id="select2-chosen-3")
	private WebElement adultsCount;
	
	private WebElement childrenCount;
	
	private WebElement infantsCount;
	
	private WebElement searchFlightsLink;

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getFlexibleDates() {
		return flexibleDates;
	}

	public WebElement getAdultsCount() {
		return adultsCount;
	}

	public WebElement getChildrenCount() {
		return childrenCount;
	}

	public WebElement getInfantsCount() {
		return infantsCount;
	}

	public WebElement getSearchFlightsLink() {
		return searchFlightsLink;
	}

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
