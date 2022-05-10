Feature: Create Contact Case

Scenario Outline: TC001_Create Contact


And Click on contacts
And click on create contact
And enter first name as <fstName>
And enter last name as <lstName>
And enter first name local as <fstLName>
And enter lastname local as <lstLName>
And enter department name as <deptName>
And enter contact desc as <ctDesc>
And enter prim email as <pEmail>
And Select State Province as <sProv>
When click create contact
Then View contacts page is displayed


Examples:
|fstName||lstName||fstLName||lstLName||deptName||ctDesc||pEmail||sProv|
|'TestLeafFirst'||'TestLeaflast'| |'TestLeafFirstLocal'| |'TestLeafLastLocal'| |'Testdepartment'| |'TestDesc'| |'testleafhetty@testleaf.com'| |'New York'|
|'Hetty'||'Test'| |'FirstLocal'| |'LeafLastLocal'| |'departmentTest'| |'DescTes'| |'testleafhetty91@testleaf.com'| |'Alaska'|