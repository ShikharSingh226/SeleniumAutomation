Feature: Booking Task on Goibibo website  
  

Scenario Outline: Test Goibibo Website

Given user is on goibibo page
When user tap on one way
Then user enter "<source>" & "<destination>"
Then user select departure "<date>" & "<month>"
Then user selects traveller details 
Then user selects cheapest price 
Then user book and review

Examples:
     | source    | destination | date  |  month      |
     | New Delhi |   New York  |  15   |  July 2021  |