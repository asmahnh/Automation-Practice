#Author: Asma Hanifah
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: As a new user
I want to be able to register to the website
So that I can login as a registered user

Background: 
		Given User open the URL Testing
		When User clicks Sign in menu

  @PositiveTest
  Scenario Outline: User register new account successful
    And User enter an email address <email>
    And User clicks Create an account button
    And User select the title <title>
    And User enter the First Name <firstname>
    And User enter the Last Name <lastname>
    And User enter the Password <password>
    And User select the date of birth <date>
    And User select the month of birth <month>
    And User select the year of birth <year>
    And User enter the Company <company>
    And User enter the Address <address>
    And User enter the Address Lain <addresslain>
    And User enter the City <city>
    And User select the State <state>
    And User enter the Zipcode <zipcode>
    And User select the Country <country>
    And User enter the Homephone <homephone>
    And User enter the Mobilephone <mobilephone>
    And User clicks Register button
    Then User register new account successful
    
    Examples: 
      | email 								| title | firstname | lastname | password 	| date | month | year | company    | address 					| addresslain | city 		 | state | zipcode | country | homephone | mobilephone |
      |gorohov1976@tubidu.com | Mr.		| Asma			| Tester	 | Testing01@ | 5    |  12   | 1992 | Jarv Group | Menara Cakrawala | Unit A			| New York | 32    | 06830   | 21			 | 655555566 | 85552225555 |