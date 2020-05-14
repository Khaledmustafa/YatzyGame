Feature: Yatzy Game
  As a player i would like to play a game of Yazy with my friend

  @CreateDice
    Scenario: Create Dice
      Given I Start a game of Yatzy
      When I
      Then dices should be created
#staging branch

 @throwAllDices
    Scenario: Throw all dices
      Given I have started a game of Yatzy
      When It's the start of the round
      And I choose to throw dice
      Then i should throw all the dices


 @throwDice
    Scenario: Throw 1 or more dices
      Given It's my turn
      When I have thrown all the dices at least once
      Then I can choose how many dices to throw

 @saveDice
    Scenario: Save Dice
      Given It's my turn
      When I have thrown the dices atleast once
      Then I should be able to save 1-6 dices


 @showScore
    Scenario: Show total score
      Given I start a game of Yatzy
      Given It's my turn
      When I  press key for score
      Then The total score should be shown