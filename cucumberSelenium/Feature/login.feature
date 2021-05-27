@login
Feature: Login page Details
  I want to use log in successfully
  
	@positive
  Scenario: Login on the page.
    Given User is on the login page
    When user enters "<user>" & "<password>"
    When user clicks on submit btn
    Then user is on home page
    Examples:
    |user|password|
    |rohit|rohit123|
    
    @negative
    Scenario Outline: Login on the page.
    Given User is on the login page
    When user enters "<user>" & "<password>"
    When user clicks on submit btn
    Then user is on same page
    
    Examples:
    |user|password|
    |admin|admin123|
    ||admin123|
    |admin||