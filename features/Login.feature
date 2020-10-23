Feature: Login functionality for LeafTaps application

#Background:
#Given open the chrome browser as maximized   
#Given load the application url

Scenario Outline: Test login with  positive credentials


Given enter the username as <username>
Given enter the password as <password> 
When click on login button 
Then homepage should be displayed 

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|

Scenario:


Given enter the username as demo123
Given enter the password as crmsfa 
When click on login button 
But error message should be displayed 



