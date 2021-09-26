Feature: Facebook login Feature

@Sanity

Scenario: To Login using Positive Credentials

Given Launch The Appliction

When Valid Username is entered
And Valid Password is Entered
When Login button is Clicked
Then Verify user is logged in

