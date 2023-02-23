
Feature: Verify Login Functionality
	I want test login page functionality
	
	#Description : To verify the login functionality with valid credentials
	#Author: Aadesh.K
	#Date : 2/8/2023
	@Login @Sanity
	Scenario: To verify the login functionality
	Given user is on login page
	When user enters data "9604154175" in Mobile number textbox
	Then user clicks on SignUp button
	And user enters "2812" in pinbox
	And user clicks on submit pin button   
	Then user should land on HomePage
	And user closes the browser

	
	
	@Login @Regression
	Scenario Outline: To verify the login functionality with data
	Given user is on login page
	When user enters data "<Mobile Number>" in Mobile number textbox
	Then user clicks on SignUp button
	And user enters "<Pin>" in pinbox
	And user clicks on submit pin button   
	Then user should land on HomePage
	And user closes the browser
	
	Examples:
	|Mobile Number|Pin   |
	|9604154175   |2812  | 
	|1234567891   |1234  |
	