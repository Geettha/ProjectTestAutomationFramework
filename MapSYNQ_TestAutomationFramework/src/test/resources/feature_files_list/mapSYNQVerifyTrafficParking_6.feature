Feature: Verification of Traffic Parking Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@Suite @ParkingMapper @Map
Scenario: Verification of Traffic Parking Map Feature[TS_VerifyMapFeature_TrafficParkingMap_1.1]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	Then I click on the "Parking" icon button on Map app
	Then I verify Parking Slots icon should be displayed
	When I click on the "ParkingSlots" icon button on Map app
	Then I verify content info pop up should be displayed
	When I click on "Zoomin" link on Content Pop up
	Then I verify Map should be zoomed and show Parking Slots Icons displayed
	When I click on the "ParkingIcon" icon button on Map app
	Then I verify content info pop up should be displayed
	Then I close browser
	
