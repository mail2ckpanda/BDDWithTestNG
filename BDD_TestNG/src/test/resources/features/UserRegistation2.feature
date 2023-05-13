Feature: User registation and adding products to cart
@smoke
 Scenario: Verify Home page title1
Given user is on home page of application
When user gets the title of the home page
Then page title should be "Takealot.com: Online Shopping"
@regression @smoke
 Scenario: Verify Home page title2
Given user is on home page of application
When user gets the title of the home page
Then page title should be "Takealot.com: Online Shopping"

