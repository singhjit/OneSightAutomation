Feature: OneSight User Login and Logout Functionality 


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page


@SmokeTest @RegressionTest
Scenario: Validate User Login and Logout

Then user logs out from onesight
Then user closes the browser