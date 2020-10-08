Feature: Google Basic Math Functions
Scenario Outline: Test addition with valid numeric values

Given User navigate to Google search page
When User enters <math_function>
And User clicks the Google Search button
Then The Google results page is displayed with the correct <result> from the addition of the numeric values

Examples:
	| math_function	| result	|
	| 3+4						| 7				|
	| 8+6						|	14			|
	| 12+9					| 21			|