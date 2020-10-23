Feature: Using LeafTaps Merge the Lead Application


@SmokeTest @RegressionTest
Scenario Outline: 

Given enter the username as demosalesmanager
Given enter the password as crmsfa 
When click on login button 
Then homepage should be displayed
Given click on crmsfa link 
And click on Lead button
And click on Merge Leads  
And click on the lookup  
Given Enter Merge Lead first name as <fname> 
And click on Merge Find Leads button
And click on the first resulting lead id 
And click on the lookup page
Given Enter the first name again as <Fname> 
And click on Merge Find Leads button again
And click on the second time first leads 
And click on Merge
And click on Ok in the alert
Given find lead page Enter Lead id 
When click on find leads button again
Then record is displayed 

Examples:
|fname|Fname|
|gopi|babu|