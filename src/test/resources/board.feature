Feature: Game of life board

Scenario: Clean slate
  Given no startup position
  When a game is started
  Then the game initializes correctly
