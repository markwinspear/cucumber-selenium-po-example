@smoke @login @p1 @sauce
Feature: Authentication

  Scenario: Successfully logging in
    Given the Symbiote home page
    When logging in as an admin
    Then the home page navigation is available