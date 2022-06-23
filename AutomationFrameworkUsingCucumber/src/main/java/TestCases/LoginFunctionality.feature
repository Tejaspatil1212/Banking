Feature: This file contains Login functionality testcases

	Scenario: Test Login functionality with Valid credentials
	Given User is on Login page
	When User enters "Admin" in UserName field
	And User enters "admin123" in Password field
	And User clicks on Login button
	Then User should be on Dashboard page 