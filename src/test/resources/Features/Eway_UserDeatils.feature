Feature: Customer onbord page

  @All
  Scenario:User should be able to log in to the E-Way Portal
    Given the user launches the E-Way Portal URL
    When the user enters a valid username and password
    Then the user should be redirected to the landing page

@TC02
  Scenario Outline: User needs to create a customer onboarding page
    Given the user launches the E-Way Portal URL
    When the user enters a valid username and password
    Then the user should be redirected to the landing page
    And the user clicks "Customer" in the left-side menu
    And the user clicks the "Add" button
    And the Customer Onboarding page should open
      And the user enters customer information "<IsGST>", "<legalName>", "<tradeName>", "<gst>", "<panno>"
  And the user click "Next" button
    And the user provides the customer address "<name>", "<addressLine1>", "<addressLine2>", "<country>", "<state>", "<city>", "<pincode>"
    And the user adds the address information
    And the user fills in the contact details "<contactPerson>", "<designation>", "<mobile>", "<alternateMobile>", "<email>", "<telephone>", "<fax>"
    And the user saves the customer information
    Then the user verifies the created information in the customer dashboard

    Examples:
      | IsGST | legalName | tradeName   | gst    | panno     | name     | addressLine1 | addressLine2 | country | state      | city    | pincode | contactPerson | designation | mobile     | alternateMobile | email            | telephone  | fax        |
      | No    | ABC Corp  | ABC Traders | 123456 | AMTLP0722L | John Doe | 123 Main St  | Apt 4        | India   | Tamil Nadu | Chennai | 600001  | John          | Manager     | 9876543210 | 9876500000      | john@example.com | 044-123456 | 044-654321 |
