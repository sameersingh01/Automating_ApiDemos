@show
Feature: Show feature


  Scenario: Testing Show feature
    Given User is in Api Demos and clicks on Animation button
    When User clicks on Hide-Show Animation button
    Then User lands on page and it clicks on the number to hide    
    Then User clicks on show button and number appears again
