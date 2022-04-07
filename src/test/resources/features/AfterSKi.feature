Feature: I have skied all day and want to go to after ski

  Scenario: Let me see all the beers
    Given I go to the best bar in Bydalen
    When I ask to see a list of all the beers
    Then all the beers in the bar is presented. I expect the best bar in Bydalen to have at least 10 different beers


  Scenario: I want to order a beer from the list
    Given I find a beer I like in the beer list
    When I order the beer from the the bartender
    Then I should get the beer I asked for
