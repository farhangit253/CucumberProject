Feature: This is to test Searching Item in a Cart


Scenario: Searching Cart Items in AmazonPage

Given Open chromebrowser and type amazon url
Then User clicks on SignIn link
When User is going to enter below username
|9700403445|
Then User should click on next button
When User is going to enter below password
|Farhan@253|
Then  User should click the submit button
When User is going to click Cart link in Homepage
Then Items in the cart should visible