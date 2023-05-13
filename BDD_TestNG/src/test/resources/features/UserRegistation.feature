Feature: User registation and adding products to cart
#@smoke1
#Scenario Outline: Verify new user registation functionality works as expected.
#Given user is on home page of application
#When user gets the title of the home page
#Then page title should be "Takealot.com: Online Shopping"
#When user click on register link
#Then user is on resistation page
#And user enters <FirstName> in firstname field
#And user enters <LastName> in lastname field
#And user enters valid email id in email address field
#And user enters <Password> in password field
#And user selects <CountryCode> from countryCode field
#And user enters <PhoneNumber> in mobile number field
#Then user verify that the receive newsletter checkbox is checked by default
#And user clicks the register button
#Then user is registered and logged into the application
#When user search for "Watches" in the search bar
#And user applies brand filter as <Brand>
#And user add <Item1> to cart
#And user add <Item2> to cart
#Then user verifies the quantity in cart is updated as 2
#
#Examples:
#|FirstName|LastName|Password|CountryCode|PhoneNumber		|Brand	|Item1|Item2|
#|"Anwesha"|"P"|"Anw121234"|1|"183456789"|"garmin"|"Garmin Forerunner 45 Sports Smartwatch (42mm) - Black"|"Garmin Venu Sq 2Music Edition Cream Gold Bezel with French Gray Case Silicone Band"|
 #
 #
 
 @regression
 Scenario: Verify Home page title1
Given user is on home page of application
When user gets the title of the home page
Then page title should be "Takealot.com: Online Shopping"
@smoke
 Scenario: Verify Home page title2
Given user is on home page of application
When user gets the title of the home page
Then page title should be "Takealot.com: Online Shopping"

