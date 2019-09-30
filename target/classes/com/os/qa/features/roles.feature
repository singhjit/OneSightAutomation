Feature: OneSight User Role Creation and Deletion Functionality


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page


@RegressionTest
Scenario Outline: Validatate User Role Creation


Then user clicks on roles link
Then user clicks on add role link to add a role
Then user enters add role details "<rolename>"
Then user closes add role window
Then user logs out from onesight
Then user closes the browser


Examples:
	| rolename		   |
	| automationrole1  |
#	| automationrole2  |	



@SmokeTest
Scenario: Validatate User Role Deletion

Then user goes to role page to delete the user role
Then user selects the user role and remove the user role
Then user closes add role window
Then user logs out from onesight
Then user closes the browser

	