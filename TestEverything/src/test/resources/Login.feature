Feature: Login Test

  Scenario: Login_Valid Data
    Given I login to portal
		When I open menu "Admin=>User Management=>Users"
		When I click on "Add Button" button
		When I create user with following data
		|Aaliyah Haq|User4|Global Salary Admin|Softwaretesting|Softwaretesting|