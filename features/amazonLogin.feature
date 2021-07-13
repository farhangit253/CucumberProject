Feature: This is to test login operation in amazonpage


Scenario: Login with valid details

Given Open chromebrowser and type amazon url
Then  User clicks on SignIn link
When  User is going to enter below username
|9700403445|
Then User should click on next button
When User is going to enter below password
|Farhan@253|
Then  User should click the submit button