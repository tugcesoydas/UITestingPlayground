@AllCases
Feature: UI Test Automation Playground

  @TC-01
  Scenario: Class Attribute

    Given Click Class Attribute case
    When Click Blue Button
    Then Press OK in alert pop up


  @TC-02
  Scenario: Hidden Layers

    Given Click Hidden Layers case
    When Click Green Button
    Then Make sure that green button can not be hit twice


  @TC-03
  Scenario: Load Delay
    Given Click Load Delay case
    When Click Button

  @TC-04
  Scenario: Text Input
    Given Click Text Input case
    When Text into the input field
    Then Verify that button name is changed according to input

  @TC-05
  Scenario: Mouse Over
    Given Click Mouse Over case
    When Click the link 2 consecutive times
    Then Verify that click count is increasing by 2

  @TC-06
  Scenario: Scrollbars
    Given Click Scrollbars case
    When Find a button in the scroll view
    Then Verify that button is visible

  @TC-07
  Scenario Outline: : Sample App
    Given Click Sample App case
    When Wait for 3 seconds
    Then Verify successfully login username:<Username> password:<Password>
    And Wait for 3 seconds

    Examples:
      |Username  |Password|
      |testuser  |pwd     |



  @TC-08
  Scenario: Progress Bar
    Given Click Progress Bar case
    When Click Start Button
    Then Click Stop Button
    And Get result