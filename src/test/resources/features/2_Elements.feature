Feature: Validate Elements

  Background:
    Then page title should be correct

  #Scenario: Validate Training Modules


  Scenario Outline: Verify user can click on different Training Modules
    When user clicks on "<menu_option_1>" on home page
    Then "<menu_option_2>" page should be displayed successfully

    Examples:
      | menu_option_1  |menu_option_2|
      | Button Demo    |BUTTON INTERFACE DEMO|
      | Text Input Demo|TEXT INPUT INTERFACE|
      | Login Form Demo|LOGIN FORM DEMO     |
      | Dropdown & Select Demo|DROPDOWN & SELECT DEMO |
      | Checkboxes & Radio Buttons |CHECKBOXES & RADIO BUTTONS|


