Feature: Google Basic Math Functions
Scenario: Test addition with valid numeric values

Given User navigate to Google search page
When User enters <math_function>
And User clicks the Google Search button
Then The Google results page is displayed with the correct result from the addition of the numeric values