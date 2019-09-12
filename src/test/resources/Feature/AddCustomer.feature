Feature: To add customer details

#  Scenario: 
#    Given User is in telecom home page
#    And click on add customer button
#    When user enters all the fields with valid data
#    And clicks on submit button
#    Then customer id should be generated and displayed

#  Scenario: 
#    Given User is in telecom home page
#   And click on add customer button
#    When user enters all the field with valid data.
#      | archana | subbian | archana@gmail.com | chennai | 9003261856 |
#    And clicks on submit button
#    Then customer id should be generated and displayed

#  Scenario: 
#    Given User is in telecom home page
#    And click on add customer button
#    When user enter all the field with valid data.
#      | fname   | archana           |
#      | lname   | subbian           |
#      | email   | archana@gmail.com |
#      | address | chennai           |
#      | phnno   |        9003261856 |
#    And clicks on submit button
#    Then customer id should be generated and displayed

  Scenario Outline: 
    Given User is in telecom home page
    And click on add customer button
    When user enterss all the field with valid data "<fname>","<lname>","<email>","<address>","<phone>"
    And clicks on submit button
    Then customer id should be generated and displayed

    Examples: 
      | fname   | lname     | email             | address  | phone       |
      | archana | subbian   | archana@gmail.com | chennai  | 94456237895 |
      | hema    | subbian   | hema@gmail.com    | kknagar  | 94456237880 |
