Feature: Verification of Traffic Incidents Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@Suite @IncidentMapper @Map	
Scenario: Verification of Incidents Map feature between Incidents Info Panel and Map[TS_VerifyMapFeature_ContentsMatching_1.1]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I verify News Menu Panel should be displayed
	When I click on "Incidents" item on Info Panel
	Then I verify Content Pop up should be displayed on Map 
	Then I verify contents in Info Panel and Content Pop up for "Incidents0" matches
	When I click on "Accident" item on Info Panel
	Then I verify Content Pop up should be displayed on Map 
	Then I verify contents in Info Panel and Content Pop up for "Incidents1" matches
	When I click on "HeavyTraffic" item on Info Panel
	Then I verify Content Pop up should be displayed on Map 
	Then I verify contents in Info Panel and Content Pop up for "Incidents3" matches
	Then I close browser

@Suite @IncidentMapper @Map	
Scenario: Verification of Search Incident Location Info Panel [TS_VerifyMapFeature_SeacrhIncidentInfo_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I verify News Menu Panel should be displayed
	When I enter "Accident" in Search text box
	Then I verify searched items displayed on News Info Panel
	When I click on "Accident" item on Info Panel
	Then I verify Content Pop up should be displayed on Map 
	Then I close browser

@Suite @IncidentMapper @Map	
Scenario: Verification of Incident icons in Map [TS_VerifyMapFeature_IncidentIcons_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incident" icon image on Map app
	Then I verify Incident details Pop up should be displayed
	When I click on "IncidentsLink" link on Incident details Pop up 
	Then I verify Incident details Content Pop up should be displayed
	Then I click on "Incident" icon image on Map app
	When I click on "Zoomin" link on Incident details Pop up 
	Then I verify map should be zoomed with Incident Details Content Pop up
	Then I close browser	
	