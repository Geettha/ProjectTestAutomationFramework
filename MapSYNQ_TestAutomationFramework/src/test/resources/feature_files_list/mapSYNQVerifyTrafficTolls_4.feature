Feature: Verification of Traffic Tolls Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@TestSuite @TollsFeature @Map	
Scenario: Verification of Tolls feature in Traffic Map App[TS_VerifyMapFeature_TollsFeature_1.1]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	When I click on the "Tolls" icon button displayed on Map app
	Then I verify toll icons should be loaded in map
	Then I click on the "Tolls" icon image displayed on Map app
	Then I verify Tolls Pop up should be displayed on Map 
	Then I close browser
	
	

@TestSuite @TollsFeature @Map	
Scenario: Verification of Tolls button on the Info Panel[TS_VerifyMapFeature_TollsFeatureInfoPanel_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	When I click on the "Tolls" icon button displayed on Info Panel
	Then I verify Singapore Tolls should be displayed
	When I click on "TollsLink" link displayed in Info Panel
	Then I verify Tolls Pop up should be displayed on Map   
	Then I close browser
	
@TestSuite @TollsFeature @Map	
Scenario: Verification of Search Tolls feature in Info Panel[TS_VerifyMapFeature_SearchTollsInfoPanel_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	When I click on the "Tolls" icon button displayed on Info Panel
	Then I verify Singapore Tolls should be displayed
	When I enter "Anson Road" tolls search textbox on Info Panel
	Then I verify the TollLink should display by SearchText
	When I click on "TollsLink" link displayed in Info Panel
	Then I verify Tolls Pop up should be displayed on Map  
	Then I close browser
	

