@login2
Feature: Adminlogin to HRM Home PAge
In Order to Loginto Orange HRM 
As a Admin with Valid UserName and Password
I want to enter UserNAme, Password, Click on login Button to Accesto the application
 
Scenario: Positive- AdminLogin Successfully
Given Admin Navigateto HRM Login Page
When Admin Enter ValidUserName and Password
And Click on LogingButton
Then Admin will Land in Admi homepage

