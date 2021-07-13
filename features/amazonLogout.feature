Feature: This is to test logOut operation in amazonpage


Scenario: verifying Logout functionality

Given Open chromebrowser and type amazon url
Then User clicks on SignIn link
When User is going to enter below username
|9700403445|
Then User should click on next button
When User is going to enter below password
|Farhan@253|
Then  User should click the submit button
When user is going to clcik on Logout link
Then User should able to logOut