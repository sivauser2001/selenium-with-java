Feature:test login functionality
Scenario Outline:check loginis successful with
Given  chrome browser is open
And user is on google search page
When user enters <username> and <password>
And user clicks on login
Then user is navigated to search result

Example:
|username|password|
|siva||12345|
|ramu|27632|
|satti|87478|
 