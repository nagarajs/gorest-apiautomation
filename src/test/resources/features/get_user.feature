@Test
Feature: Get users

Scenario Outline: Get user with parameter gender
Given the user with gender "<gender>"
When sent request user
Then should return status code 200
And validate data user gender should be "<gender>"
Examples:
| gender |
| male   |