Feature: Verification of Traffic Camera Map features

Background: 
	Given user navigates to application URL : "${map.url}" application 

@TestSuite @CameraFeature @Map	
Scenario: Verification of Camera feature in Traffic Map App[TS_VerifyMapFeature_CameraFeature_1.1]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	When I click the "Cameras" icon button on Map app
	Then I verify camera icons should be loaded in map
	Then I click on the "Cameras" icon image on Map app
	Then I verify Camera Pop up should be displayed on Map 
	Then I close browser
	
	

@TestSuite @CameraFeature @Map	
Scenario: Verification of Camera button on the Info Panel[TS_VerifyMapFeature_CameraFeatureInfoPanel_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	Then I click on "Incidents" icon button on Map app
	When I click on the "Cameras" icon button on Info Panel
	Then I verify Singapore Live Traffic Cameras should be displayed
	When I click on "CameraLinks" link in Info Panel
	Then I verify Camera Pop up should be displayed on Map   
	Then I close browser
	
@TestSuite @CameraFeature @Map	
Scenario: Verification of Search Camera feature in Info Panel[TS_VerifyMapFeature_SearchCameraInfoPanel_1.2]
	Given I am on mapSYNQ Landing Page
	When I click on Ad Toggle icon
	Then I verify Galactio Ad info should not be displayed
	Then I verify Map should be loaded on page with Incidents selected Default
	When I click on the "Cameras" icon button on Info Panel
	Then I verify Singapore Live Traffic Cameras should be displayed
	When I enter "Adam Road" search textbox on Info Panel
	Then I verify CameraLink should display by SearchText
	When I click on "CameraLinks" link in Info Panel
	Then I verify Camera Pop up should be displayed on Map  
	Then I close browser
	

