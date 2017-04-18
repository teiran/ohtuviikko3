Feature: A new user account can be created if a proper unused username and password are given

  Scenario: creation successful with correct username and password
    Given new user is selected
    When correct new username "eeeeeee" and password "akkujasd1" and password Confirmation "akkujasd1" are given
    Then user is signed in

  Scenario: creation fails with too short username and valid passord
    Given new user is selected
    When correct new username "as" and password "akkujasad1" and password Confirmation "akkujasd1" are given
    Then user is not created and error "username should have at least 3 characters" is reported

  Scenario: creation fails with correct username and too short password
    Given new user is selected
    When correct new username "asasd" and password "asd2" and password Confirmation "asd2" are given
    Then user is not created and error "password should have at least 8 characters" is reported

  Scenario: creation fails with correct username and password consisting of letters
    Given new user is selected
    When correct new username "asas" and password "akkujasadasdasd" and password Confirmation "akkujasadasdasd" are given
    Then user is not created and error "password can not contain only letters" is reported

  Scenario: creation fails with already taken username and valid pasword
    Given new user is selected
    When correct new username "jukka" and password "akkujasad1" and password Confirmation "akkujasad1" are given
    Then user is not created and error "username is already taken" is reported

  Scenario: creation fails when password and password confirmation do not match
    Given new user is selected
    When correct new username "jukasdaka" and password "akkujasad1" and password Confirmation "akkujasd21" are given
    Then user is not created and error "password and password confirmation do not match" is reported
