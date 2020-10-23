Feature: Using LeafTaps to delete the Lead

@FunctionalTest @RegressionTest
Scenario:

Given enter the username as demosalesmanager
Given enter the password as crmsfa 
When click on login button 
Then homepage should be displayed
Given click on crmsfa link 
And click on Lead button
And click on Find Leads option     
And Click on Phone number and give phone number as 89 
And click the button of find 

And Click the list of lead id  
And click the delete button
And again click the find lead
And Enter the name field in lead id is 11528
When Click find button 
Then the string text is 