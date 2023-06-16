Feature: BlazeDemo Search Functionality

  Scenario Outline: Verify purchase functioanlity
    Given User navigates to BlazaDemo Purchase "https://blazedemo.com/purchase.php"
    When User enters Name "<Name>"
    And User enters Address "<Address>"
    And User enters City "<City>"
    And User enters State "<State>"
    And User enters Zip Code "<Zip Code>"
    And User selects Card Type "<Card Type>"
    And user enters Credit Card Number "<Credit Card>"
    And User enters Month "<Month>"
    And User enters Year "<Year>"
    And User enters Name on Card "<Name on Card>"
    And User check Remember me
    And user clicks purchase Flight
    Then User verifies success message "<message>"
    
    Examples:
      | Name     | Address     | City      | State | Zip Code | Card Type | Credit Card      | Month | Year | Name on Card | message                           |
      | Lili M   | 123 Main St | Rockville | MD    |    56893 | Visa      | 1236985732145684 |     9 | 2023 | Lili Mattew  | Thank you for your purchasetoday! |
      | Abby K   | 345 Main St | Rockville | MD    |    42369 | Visa      | 2368497896541234 |     7 | 2023 | Abby K       | Thank you for your purchasetoday! |
      | Mimi T   | 465 Main St | Rockville | MD    |    46369 | Visa      | 9364497896541284 |     5 | 2024 | Mimi T       | Thank you for your purchasetoday! |
      | Kiki K   | 347 Main St | Rockville | MD    |    42479 | Visa      | 6398547223654987 |     4 | 2024 | Kiki K       | Thank you for your purchasetoday! |
      | Mattew U | 631 Main St | Rockville | MD    |    42399 | Visa      | 5368497896541456 |     3 | 2024 | Mattew U     | Thank you for your purchasetoday! |
