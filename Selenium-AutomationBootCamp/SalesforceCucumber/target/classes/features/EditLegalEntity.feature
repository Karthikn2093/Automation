Feature: Edit LegalEntity functionality

Scenario: Edit a legal entity
Given Login to salesforce application
And Click on the toggle menu button from the left corner
And Click View All and click Legal Entities from App Launcher
And Click on the legal Entities tab
And Search the Legal Entity Salesforce Automation by Your Name
And Click on the Dropdown icon and Select Edit
And Enter the Company name as Testleaf
And Enter Description as SalesForce
And Select Status as Active
When Click on Save and Verify Status as Active
Then Verify Edit is saved