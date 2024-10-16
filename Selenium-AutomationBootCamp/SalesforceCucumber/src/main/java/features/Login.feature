Feature: Login functionality

Scenario: TC01_Login using positive credentials
Given User is already signed into the application
When User signed in with valid credentials
Then User should be able to login and should be redirected to the HomePage
When User should click on the Menu button
And Browser should be closed