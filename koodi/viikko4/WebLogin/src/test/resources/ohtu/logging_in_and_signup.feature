Feature: A new user account can be created if a proper unused username and a proper password are given

  Scenario: user can login with successfully generated account
    Given user with username "liisa" with password "salainen1" is successfully created
    And login is selected
    When correct username "liisa" and password "salainen1" are given
    Then user is logged in

  Scenario: user can not login with account that is not successfully created
    Given user with username "aa" and password "bad" is unsuccessfully created
    And login is selected
    When correct username "aa" and password "bad" are given
    Then user is not logged in and error message is given
