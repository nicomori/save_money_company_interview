@Case_2A1
Feature: Interview Nicolas Mori

  Scenario Outline: Access to the app after make the login.

    Given I start the chrome using mobile emulator in "<mobile emulation>"
    And navigate to this "<url>"
    
    Then select this option "<popup option menu>" from the menu
    Then in the option menu, select the option Our-Offers
    Then in make click in the checkbox Easy Access and verify the message
	Then find the offer with the highest Interest rate in the list and click in register
	And make the login
	Then press the button details in the bank "<bank code name>"
    
    Examples: 
      | mobile emulation | url						 | popup option menu | bank code name	 | 
      | false			 | https://www.raisin.com/	 | Other  			 | FIM	  			 |
