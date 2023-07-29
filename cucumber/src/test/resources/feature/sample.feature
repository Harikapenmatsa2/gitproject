Feature: check home page

@Integrationtest
  Scenario: search data in page
    Given open the "https://www.google.com/"
    Then Enter data in search field
    And  click on search button
    Then verify is it going to the new page


@Systemtest
  Scenario Outline: enter data
    Given enter '<Username>'
    Then get text
    Examples:
      |Username  |
      |data1      |
    |data2           |