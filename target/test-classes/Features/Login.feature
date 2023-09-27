Feature: Book Hotel

Background: User should should navigate to the application
Scenario: Login Hotel should be success

#Given User should should navigate to the application
And User enter the username as Najumudheen 
And  User enter the password as 65F62S
Then clcik the loginbutton to success login Page


Scenario: Login Hotel should be failed

#Given User should should navigate to the application
And User enter the invalid_username as Muthu

And  User enter the invalid_password as 12345
Then clcik the loginbutton2 to success login Page



