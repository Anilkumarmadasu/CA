Feature: sofas
Scenario: hover on product
Given user launch the chrome browser
When user opens url ""
And click on search box
And send text as "sofas"
And click on search button

And navigate back
Then close browser
