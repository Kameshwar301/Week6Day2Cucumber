Feature: Using LeafTaps to create the create lead

#Background:
#Given open the chrome browser as maximized
#Given load the application url


Scenario: 

Given enter the username as demosalesmanager
Given enter the password as crmsfa 
When click on login button 
Then homepage should be displayed
Given click on crmsfa link 
And click on Lead button
And click on create lead button
And Enter the company name as MNW
And Enter the first name as Kameshwar
And Enter the last name as S
When click the submit button
Then create lead is displayed 
