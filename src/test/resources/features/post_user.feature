@Test
Feature: Post users

  Scenario: Create user with valid request body
    Given create user with valid request body
    When send request post user
    Then should return status code 201
    And response body should have id and Status







