Feature: Place the order for Products

Scenario Outline: Search Experience for product search in both home and offers page
Given User is on GreenCart Landing page
When User searched with username <productName> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <productName> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| productName|
| Tom        |
| Beet       |