Feature: Registration to LiveTraffic Information Application

Background: 
	Given user navigates to application URL : "${map.url}" application 
	
@Suite @Registration @Map
Scenario Outline: Registration of new user [TS_CreateNewAccount]
	Then I am on mapSYNQ Landing Page
	When I click on "Register" link on Top Menu Bar
	Then I navigate to mapSYNQ User Profile page
	And I enter "<FirstName>" in "profile[first_name]" Field textBox
	And I enter "<LastName>" in "profile[last_name]" Field textBox
	And I select "<Country>" from Country Field dropdown
	And I enter "<Address>" in "profile[address]" Field textBox
	And I enter "<Contact>" in "profile[contact_no]" Field textBox
	And I set value for Gender radiobutton
	And I set "<DateOfBirth>" in DateOfBirth Field textBox
	And I enter "<Email>" in "profile[email]" Field textBox
	And I enter "<Password>" in "identity[password]" Field textBox
	And I enter "<ConfirmPassword>" in "identity[password_confirmation]" Field textBox
	And I set check value for I agree to terms and conditions checkbox
	And I click on Create button
	Then I verify new mapSYNQ account successfully created
	Then I close browser

	Examples: 
		|FirstName|LastName|Country|Address|Contact|DateOfBirth|Email|Password|ConfirmPassword|
        |Tim|Lan|Singapore|PA 123|89089011|27-08-2010|giitanjalim@gmail.com|test1239|test1239|
		
