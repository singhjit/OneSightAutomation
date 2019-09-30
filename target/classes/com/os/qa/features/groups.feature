Feature: OneSight User Group Creation and Deletion Functionality 


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page

@SmokeTest
Scenario Outline: Validate User Group Creation

Then user clicks on groups link
Then user clicks on add group link to add a group
Then user enters add group details "<groupname>"
Then user closes add group window
Then user logs out from onesight
Then user closes the browser


Examples:
	| groupname		    | emailid 		        |
	| automationgroup1  | automation@test.com   |
#	| automationgroup2  | automation@test.com   |	


@SmokeTest
Scenario: Validate User Group Deletion

Then user goes to groups page to delete the user group
Then user selects the user group and remove the user group
Then user closes add role window
Then user logs out from onesight
Then user closes the browser

	