#Author: priya s

Feature: EA application
  I want to register a employee in application and login with credentials

 Scenario Outline: Register a employee in EA application
    Given user navigate to execute automate application home page with "<url>"
    When I register a employee with "<username>","<password>","<mailid>"
    Then verify whether the "<username>" is displayed in menu

Examples: 
|url|username|password|mailid|
|http://eaapp.somee.com/|MuruganKS|Welcome123@|muruganks@gmail.com|