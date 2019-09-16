Feature: To add tariff details


Background:
#Given User should be in telecom home page
    And click on add tariff button
      
@sanity
  Scenario:
  When user enter all the field with valid data
    And clicks on submit button
    Then customer id should be generated and displayed

  Scenario: 
 
    When user enters all the fields with valid datas
      |  500 |  60 | 30 | 100 | 2 | 5 | 1 |
      | 1000 | 120 | 60 | 300 | 2 | 6 | 1 |
      |  200 |  30 | 15 |  70 | 1 | 5 | 1 |
    And click on submit button
    Then tariff id should be generated and displayed

  Scenario: 
  
    When user enter all the fields with valid datas
      | Pack | Locmin | Intermin | Sms | Locchrg | Interchrg | Smschrg |
      |  500 |     60 |       30 | 100 |       2 |         5 |       1 |
      | 1000 |    120 |       60 | 300 |       2 |         6 |       1 |
      |  200 |     30 |       15 |  70 |       1 |         5 |       1 |
    And click on submit button
    Then tariff id should be generated and displayed
