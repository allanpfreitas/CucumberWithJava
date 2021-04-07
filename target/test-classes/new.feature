# language: en

  Feature: Determine if String is Palindrome or not. A String is a palindrome if it read the same backwards as forwards.

    Scenario: Valid palindrome
      Given I entered string "Refer"
      When I test it for palindrome
      Then the result should be "True"

    Scenario: Invalid Palindrome
      Given I entered string "Coin"
      When I test it for palindrome
      Then the result should be "False"

    Scenario Outline: Check if String is Palindrome
      Given I entered word <wordtotest>
      When I test it for palindrome
      Then The output should be <output>
      Examples:
        | wordtotest | output |
        | "Refer"    | "true" |
        | "Coin"     | "false"|
        | "Space"    | "false"|
        | "racecar"  | "true" |
