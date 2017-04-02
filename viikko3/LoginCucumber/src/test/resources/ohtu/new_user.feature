Feature: A new user account can be created if a proper unused username and password are given


      Scenario: creation successful with correct username and password
        Given command new user is selected
        When  username "teira" and password "asd" are entered
        Then  system will respond with "new user registered"


    Scenario: creation fails with correct username and too short password
        Given command new user is selected
        When  ...
        Then  ...