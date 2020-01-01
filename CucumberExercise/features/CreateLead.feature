Feature: Leaftaps login scenario 

Scenario: TC001 Login to Leaftaps application
	Given Open the chrome browser
	And Load the application url
	And Enter the username
	And Enter the password
	When click on login button
	Then Home page should be diplayed
	
Scenario: TC002 Invoke Create Lead screen
	Given Click on SRMSFA image
	And Click on Leads tab
	And Click on Create Leads tab
	And Enter the Company Name
	And Enter the First Name
	And Enter the Last Name
	When Click on Create Lead button
	Then View Leads Page is displayed
	
	
	
