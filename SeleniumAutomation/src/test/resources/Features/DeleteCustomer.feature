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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Delete Customer
    Given User is on Actitime loginpage
    And User login to the application with valid credentials
    When User click on tasks followed by customer and projects page
    Then User validates the customer page
    And Select the customer and click on delete button
    Then Customer will be deleted successfully
    And User validates the success message

  @tag2
  Scenario Outline: Delete Multiple Customers
    Given User is on Actitime loginpage
    And User login to the application with valid credentials
    When User click on tasks followed by customers page
    Then User validates the customer page
    And Select <customer_name> and click on delete button
    Then Customer will be deleted successfully
    And User validates the success message

    Examples: 
      | customer_name |
      | Laxmi         |
      | pushpa        |
      | vaishnavi     |
      | shamala       |
      | aishvarya     |
      | pratap        |
      | suma          |
      | lavanya       |
      | kumar         |
      | Divya         |
