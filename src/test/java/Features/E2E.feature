
Feature: i am a guest
  I want to use purchase

  Scenario Outline: customer cycle
    Given the user in the home page
    When i click on register link
    And i entered "<productname>"
    Then the register page displayed successfully

Examples:
        | productname|
        | s  |
        | k  |
