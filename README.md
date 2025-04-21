Automation Testing Assignments
#Project Name: swag Labs website
#Objective
Automate the testing of key functionalities on the sauce demo/Swag labs website 
(https://www.saucedemo.com/v1/)

#Tools/Technologies
Choose one automation stack:
Automation Framework Options:
 Selenium WebDriver (Java / Python)
 Cypress (JavaScript / TypeScript)

#Testing Frameworks:
 For Selenium: Maven Hybrid / TestNG / JUnit / PyTest / Cucumber (BDD)
 For Cypress: Mocha + Chai
Data Source Options:
 Excel (.xlsx)
 CSV (.csv)
 JSON (.json)

#Reporting Tools:
 Selenium: Extent Reports / Allure
 Cypress: Cypress Dashboard / Mochawesome

#Tasks Overview

#Task 1: Test Scenario Documentation
Create a test plan document that includes:
 Positive & Negative Test Cases
 Scenario Descriptions
 Test Data
 Environment Setup Instructions

#Task 2: Test Script Development
Develop automation scripts to cover:

#1. Homepage Load Verification after Login
 Objective: Ensure the homepage loads successfully after a valid login.
 Action:
o Perform login using valid credentials.
o Assert that the homepage is displayed.
 Approach:
o Use Data-Driven Testing for Username and Password input to validate 
multiple credential sets.
Note: Use any of the default login credentials provided on the site.

#2. Product Filtering
 Objective: Verify that product filtering (Low to High Price) works correctly.
 Action:
o Apply the filter: Sort by Price – Low to High.
o Extract and print the list of product names after filtering.

#3. Cart Operations
 Objective: Validate cart functionality.
 Action:
o Select a product from the filtered list.
o Add the selected product to the cart.
o Assert that the product is successfully added to the cart.

#4. Checkout Process
 Objective: Ensure a user can successfully complete a purchase.
 Action:
o Proceed to checkout.
o Fill in required details (if any).
o Complete the purchase process.
o Assert the order confirmation or success message.

#Task 3: Test Reporting
Set up automated test reporting with:
 Test Name
 Execution Status (Pass/Fail)
 Screenshots on Failure
Suggested Tools:
 Selenium: Extent Reports / Allure
 Cypress: Mochawesome / Dashboard
