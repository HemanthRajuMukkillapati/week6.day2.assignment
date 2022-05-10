Feature: Duplicate lead Case


Scenario: TC004_Dup Lead


Given click on Leads
And click on Create Lead
And enter Company name as 'Test Company'
And enter the first name as 'Test FirstName'
And enter the last name as 'Test FirstName'  
And enter source drop down value as 'Employee'
When click on submit
Then get the page title and print
When click on Duplicate
Given Dupcompany name as 'company updated to new'
Given Dupfirst Name as 'UpdatedName'
When click on Dupsubmit button
Then compare titles