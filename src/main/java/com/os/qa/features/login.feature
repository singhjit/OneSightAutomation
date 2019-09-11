Feature: Login Feature Test

@SmokeTest1
Scenario: Login Feature

Given user opens a browser
Then user is on onesight login page
Then user enters username and password and logs into onesight
#Then user logs out from onesight
Then user closes the browser


@SmokeTest1
Scenario: Login Feature2

Given user opens a browser
Then user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page
Then user clicks on monitor group link
Then user clicks on add monitor group
Then user closes monitor group window
Then user logs out from onesight
Then user closes the browser



@SmokeTest1
Scenario Outline: Login Feature3

Given user opens a browser
Then user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page
Then user clicks on users link
Then user clicks on add user link to add a user
Then user enters add user details "<username>" and "<password>" and "<confirmpassword>"
Then user closes add user window
Then user logs out from onesight
Then user closes the browser


Examples:
	| username 		   | password    | confirmpassword | emailid 		       |
	| automationuser1  | Empirix123! | Empirix123!	   | automation@test.com   |
	| automationuser2  | Empirix123! | Empirix123! 	   | automation@test.com   |	
	
	
	
	

@SmokeTest1
Scenario Outline: Login Feature4

Given user opens a browser
Then user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page
Then user clicks on groups link
Then user clicks on add group link to add a group
Then user enters add group details "<groupname>"
Then user closes add group window
Then user logs out from onesight
Then user closes the browser


Examples:
	| groupname		    | emailid 		        |
	| automationgroup1  | automation@test.com   |
	| automationgroup2  | automation@test.com   |	
	
	
	
@SmokeTest
Scenario Outline: Login Feature5

Given user opens a browser
Then user is on onesight login page
Then user enters username and password and logs into onesight
Then user goes to configure page
Then user clicks on roles link
Then user clicks on add role link to add a role
Then user enters add role details "<rolename>"
Then user closes add role window
Then user logs out from onesight
Then user closes the browser


Examples:
	| rolename		   |
	| automationrole1  |
	| automationrole2  |	
	







