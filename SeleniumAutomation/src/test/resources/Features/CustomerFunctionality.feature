#Author: your.email@your.domain.com
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
@tag
Feature: Customer functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Create New Customer
    Given User is on Actitime Login page
    And User login to the application with valid credentials
    When User click on tasks followed by create customer button
    Then User validates the customer creation page
    And Fill all the customer details and click on create customer button
    Then Customer will be created successfully
    And User validates the success message

  @tag2
  Scenario Outline: Create Multiple Customers
    Given User is on Actitime Login page
    And User login to the application with valid credentials
    When User click on tasks followed by create customer button
    Then User validates the customer creation page
    And Fill <customer_name> and <customer_desc> and click on create customer button
    Then Customer will be created successfully
    And User validates the success message

    Examples: 
      | customer_name | customer_desc         |
      | Laxmi         | First customer desc   |
      | pushpa        | Second customer desc  |
      | vaishnavi     | Third customer desc   |
      | shamala       | Forth customer desc   |
      | aishvarya     | Fifth customer desc   |
      | pratap        | Sixth customer desc   |
      | suma          | Seventh customer desc |
      | lavanya       | Eighth customer desc  |
      | kumar         | Ninth customer desc   |
      | Divya         | Tenth customer desc   |
