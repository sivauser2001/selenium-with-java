Feature: Login to HRM Application
Background:
Given user is on HRMLogin page "https://opensource-demo.orange
@ValidCredentials
Scenario:Loginwith vaild credentials
When User enters username as "Admin" and password as "Admin123"
Then User should be able to login successfully and new page open
@MissingUsername
Scenario:login with blank username
When user enters username as " " and password as "admin123"
Then user should be able to see a message "Reqired" below username





