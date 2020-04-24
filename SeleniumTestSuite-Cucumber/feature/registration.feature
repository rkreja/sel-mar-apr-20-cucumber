
Feature: registraion

@smoke
Scenario: register with all required fields
	Given user naviagtes to 'http://www.automationpractice.com'
	Then click on top signin button
	Then enter email address 'abc987958787@mailinator.com' to create an account
	And click on create an account button
	And user enter firstname 'john'
	And user enter lastname 'smith'
	And user enter password 'xyz1234'
	And user enter address '123 abc street'
	And user enter city 'Baltimore'
	And user select state 'Maryland'
	And user enter zipcode 20577
	And enter mobile number '9179179177'
	Then click register button
	Then verify user successfully created
	


Scenario: register with all required fields except firstname


Scenario: register with all required fields except lastname
	Given user naviagtes to 'http://www.automationpractice.com'
	Then click on top signin button
	Then enter email address 'abc987958@mailinator.com' to create an account
	And click on create an account button
	And user enter firstname 'john'
	And user enter password 'xyz1234'
	And user enter address '123 abc street'
	And user enter city 'Baltimore'
	And user select state 'Maryland'
	And user enter zipcode 20577
	And enter mobile number '9179179177'
	Then click register button
	Then error message displayed that lasname is required

Scenario: register with all required fields except email address


Scenario: register with existing userid


Scenario: register with all fields









