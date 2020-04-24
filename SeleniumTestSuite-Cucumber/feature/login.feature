Feature: Login


	
Scenario: login with valid userid and invalid password
	When user naviagtes to 'http://www.automationpractice.com'
	And click on top signin button
	Given enter userid 'abc213@mailinator.com'
	Given enter password '9864t3uyrffghei'
	And click on signin button
	Then verify text displays 'There is 1 error', and 'Authentication failed'

	

Scenario: login with valid userid and valid password
	Given user naviagtes to 'http://www.automationpractice.com'
	And click on top signin button
	And enter userid 'abc213@mailinator.com'
	And enter password 'xyz1234'
	And click on signin button
	Then verify welcome message displays 'Welcome to your account. Here you can manage all of your personal information and orders.' 
	
Scenario: try to login without entering userid and password
	Given user naviagtes to 'http://www.automationpractice.com'
	And click on top signin button
	And click on signin button
	Then verify text displays 'There is 1 error', and 'An email address required.' 
	
Scenario: login with invalid userid and password

	Given user naviagtes to 'http://www.automationpractice.com'
	And click on top signin button
	And enter userid 'abc213wrtrrewrt@malinator.com'
	And enter password 'sdlsjlsjf'
	And click on signin button
	Then verify text displays 'There is 1 error', and 'Authentication failed'


	 
	 

	
	




