# About SDET Test Automation Frmework- MAPSYNQ App(Live Traffic Application)

This framework is basically developed and designed to automate mapping apps

# Features included
1) Developed using real time project approach
Overview
The framework is developed using Cucumber - Java - Selenium.
It is a Maven project and the directory structure used that provided by Maven.
All dependencies added with Maven in pom.xml

2) UI Automation
Detailed and Clean Reporting
For Reporting used Extent Reporting API.

3) Test can be run via command line
Yes can be run via command line using mvn command
mvn -DTest=MasterTest test

4) env variables
Use of env variables implemented

5) Can be configured to to run against various browsers and OS combination 
Added classes com.livetraffic.app.lib.OperatingSystem.java; 
com.livetraffic.app.lib.WebDriverFactory.java;


6) Test run headlessly
options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

7) mobile browser supprot
Yes Appium Driver implemented.

8) Capture screenshot in failure
Implemented with Extent Reports with Hooks.java @After Method

9) Clean commit history
Please help verify GIT Hub url

10) Test run in parallel
Can be implemented in 2 ways
-> Using Cucumber JVM Parallel plugin
-> Using SureFire Plugin
{Used below option. Implemented **/*TR.java runner classes for 2 feature files for parallel run}

11) Containerize
Not implemented [Due to Time Constraint]




# Tools , Approaches and Technologies Used

* Gherkin
* Core Java
* Selenium WebDriver API
* chromeDriver
* Cucumber
* Page Object Model Design pattern
* Junit
* Maven
* Chrome

# How to Setup & Configure

  1. Install Eclipse ( any latest version will do )
  2. Install Maven plugin in ecplise if it is not present
  3. Use git clone to download the automation framework to your local system , GIT URL 
	
	https://github.com/Geettha/SDET-Project.git
	
	Note : Develop branch is the automation stable code

  4. Locate pom.XML and right click and choose Run As -> Maven Build
  5. In the run configurations provide below values and click apply and run.

		Goals : generate-resources
		Profiles: <profile-to-be-used>

  6. Check whether the build is successful
  7. Now , locate the Test file you want to execute.
   Basically each test file has one or more tag such as @TestSuite. When we run one of these test file all the features/scenarios belonging to that tag/s runs. 
  
  For run both scenarios or more
  mvn -Dcucumber.options="--tags @Testsuite --tags @Suite"

  For run either scenarios
  mvn -Dcucumber.options="--tags @Testsuite,@Suite"
  
  
  This step would launch the browser and launch the application and runs the scenarios written in <modulename>.feature files under resources/feature_files/ path.

  8. You can also execute the same using any IDE such as eclipse by just right clicking on same test file as mentioned above and run as -> Junit Test.
  9 To launch all of the test cases together one can use below command.
  
  mvn -DTest=MasterTest test
  
  This is basically going to run all Feature Files available at path src/test/resources/feature_files irrespective of their actual tag used. 

#Features automated
1) Registration Features( # of scenarios 1)
2) General Components of Traffic Map (# of scenarios 1)
3) Camera Feature (# of scenarios 3)
4) Incident Features(# of scenarios 3)
5) Parking Feature (# of scenario 1)
6) Speed Feature (#of scenario 1)
7) Toll Features (#of scenarios 3)