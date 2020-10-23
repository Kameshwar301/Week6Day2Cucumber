Feature: Using LeafTaps find the Duplicate Lead

@FunctionalTest @SmokeTest
Scenario:

Given enter the username as demosalesmanager
Given enter the password as crmsfa 
When click on login button 
Then homepage should be displayed
Given click on crmsfa link 
And click on Lead button
And click on Find Lead option  
And Click on Phone number and give phone number as 99 
And click the button of find lead
And Click the first list of lead id
And Click the Duplicate button
When click the final submit button  
Then The duplicate lead is created

