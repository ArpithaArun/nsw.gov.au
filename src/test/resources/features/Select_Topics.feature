Feature: Selecting Topics in the News Portal

  Scenario Outline: Selecting Topics in the News Portal

      Given I am on the NSW news page
      When Select "<Topic>" and apply
      Then News articles of the "<Topic>" will be displayed

    Examples:
      | Topic |
      | Awards |


  Scenario Outline: Verifying if filters are removed

    Given I am on the NSW news page
    When Select "<Topic>" and apply
    Then Verify if Reset button is visible
    And  Verify Reset removes the filters on the results

    Examples:
      | Topic  |
      | Awards |




