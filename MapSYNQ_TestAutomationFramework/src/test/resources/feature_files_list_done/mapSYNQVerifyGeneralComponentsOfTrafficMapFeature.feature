Feature: Verification of General Components Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@Suite @TrafficMapper @Map
Scenario: Verification of General Components of Map feature [TS_VerifyMapFeature_GeneralComponents_1.0]
	Then I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I verify Direction icon on Map
	When I click on "North" Icon 
	Then I verify maps should move according to direction
	When I click on "South" Icon 
	Then I verify maps should move according to direction
	When I click on "East" Icon 
	Then I verify maps should move according to direction
	When I click on "West" Icon 
	Then I verify maps should move according to direction
	Then I verify Zoom Bar icon on Map
	When I click on "Plus" Icon 
	When I click on "Minus" Icon 
	Then I verify Drag icon on Zoom Bar
	When I click on "Legend" Icon 
	Then I verify Legend Poup up should be displayed
	When I click on "Calendar" Icon 
	Then I verify Calendar Poup up should be displayed
	When I click on SP Toggle icon
	Then I verify Left Navigation Panel should not be displayed
	Then I close browser