Feature: Login Test

  Scenario: Login_Valid Data
    Given I login to portal
		When I open menu "Expense=>Configuration=>Expense Types"
