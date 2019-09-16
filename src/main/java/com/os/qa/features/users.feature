Feature: OneSight User Creation and Deletion Functionality


Background: 
Given user opens a browser and launch the OneSight url
When user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page


@SmokeTest
Scenario Outline: Validatate OneSight User Creation

And user clicks on users link
Then user clicks on add user link to add a user
Then user enters add user details "<username>" and "<password>" and "<confirmpassword>"
Then user closes add user window
Then user logs out from onesight
Then user closes the browser

Examples:
	| username 		   | password    | confirmpassword | emailid 		       |
	| automationuser1  | Empirix123! | Empirix123!	   | automation@test.com   |
#	| automationuser2  | Empirix123! | Empirix123! 	   | automation@test.com   |	
	


@SmokeTest
Scenario: Validatate OneSight User Deletion

Then user goes to user page to delete the user
Then user selects the user and remove the user
Then user closes add user window
Then user logs out from onesight
Then user closes the browser



