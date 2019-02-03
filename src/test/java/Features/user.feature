Feature: User Registration
check if user can register in e-commerce website

Scenario Outline: User Registration
Given the user in the home page
When i click on register link
And i entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
Then the register page displayed successfully

Examples:
        | firstname | lastname | email | password |
        | s       |g       | s@g.com | 696967 |
        | k       |m       | m@x.b   | 4564554 |