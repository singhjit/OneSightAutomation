Feature: OneSight Monitor Group Creation and Deletion Functionality


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page


@SmokeTest
Scenario Outline: Validate Monitor Group Creation

Then user clicks on monitor group link
Then user clicks on add monitor group
Then user enters add monitor group details "<monitorgroupname>"
Then user closes monitor group window
Then user logs out from onesight
Then user closes the browser

Examples:
	| monitorgroupname	|
	| automationgroup1  |
	
	
	
@SmokeTest
Scenario: Validate Monitor Group Deletion

Then user goes to monitor group page to delete the group
Then user selects the monitor group and remove the monitor group
Then user closes monitor group window
Then user logs out from onesight
Then user closes the browser
	