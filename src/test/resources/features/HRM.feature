Feature: Login to HRM Application

Scenario: Login with valid credentials
Given user is on HRM login page "https://opensource-demo.orangehrmlive.com"
When user enters username as "Admin" and password as "admin123"
Then user clicks on login
Then user should be able to login successfully 
