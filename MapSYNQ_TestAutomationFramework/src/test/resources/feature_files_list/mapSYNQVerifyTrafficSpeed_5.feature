Feature: Verification of Traffic Speed Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@Suite @TrafficSpeedMapper @Map
Scenario: Verification of Traffic Map feature [TS_VerifyMapFeature_Traffic_1.1]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	Then I click on "Directions" icon button on Map app
	Then I verify Info Panel should be displayed
	When I click on "Traffic" icon button on Map app
	Then I verify Live Traffic Panel should be displayed
	When I right click on Map to select "Set As Current Location" from context Menu
	Then I verify Icon for current location should be displayed
	When I click on "CurrentLocation" icon button on Map app
	Then I verify Current Location details Pop up should be displayed
	When I click on "FromHere" link on Current Location details Pop up
	Then I verify Current Location field on Directions Input screen populated
	When I click on "ToHere" link on Current Location details Pop up
	Then I verify To Location field on Directions Input screen populated
	When I click on "Zoomin" link on Current Location details Pop up
	When I click on "StreetView" link on Current Location details Pop up
	Then I verify Street View should be displayed
	When I click on "Calendar" link on Current Location details Pop up
	Then I verify Pop up should be displayed on Directions Input screen
	When I click on "Places" link on Current Location details Pop up
	Then I verify Pop up should be displayed on Directions Input screen
	When I click on "Close" link on Current Location details Pop up
	Then I verify Current Location details Pop up should not be displayed
	When I right click on Map to select "Reset Current Location" from context Menu
	Then I verify Icon for current location should not be displayed
	Then I close browser