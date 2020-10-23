Feature: Using LeafTaps to modify or Edit the Find Lead

@FunctionalTest
Scenario:

Given enter the username as demosalesmanager
Given enter the password as crmsfa 
When click on login button 
Then homepage should be displayed
Given click on crmsfa link 
And click on Lead button
And click on Find Lead button 
And Search with the first name as Kameshwar
And click on find button 
And Click on first result Lead ID
Then Lead page is Opened
Given Click on Edit button
And Enter new company name as Wipro
When Click on update button
Then Company name Edited as Successfully