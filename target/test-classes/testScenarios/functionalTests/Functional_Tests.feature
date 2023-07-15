Feature: Login tests

Description: This feature file is to test login pages.


@TC001 @Registration
Scenario: Sign up Vita Mojo

Given User is on home page
When  Enter details in signup form
Then Validate account name
And Close the browser

@TC002 @Login
Scenario: Login to Vita Mojo

Given User is on home page
When  Enter username and password
Then  Close the browser
