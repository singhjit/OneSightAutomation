Feature: OneSight Ping Monitor Creation and Deletion Functionality


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page


@SmokeTest
Scenario Outline: Validate Ping Monitor Creation

Then user clicks on monitor link
Then user clicks on add monitor
Then user selects ping monitors
Then user logs out from onesight
Then user closes the browser

Examples:
	| monitor			|
	| automationgroup1  |
	