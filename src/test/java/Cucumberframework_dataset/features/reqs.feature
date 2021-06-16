Feature: Test the contact form in web application.

Background:
Given I navigate to the demo store url "http://services.smartbear.com/samples/TestComplete12/smartstore/"
And navigate to contactus page

Scenario: 
Test the form for submission.
And I enter a "Superhero" Name.
And I enter a "u@me.com" EmailId.
And I enter enquiry
|Enquiry line 1|Enquiry line 2|
When I click on Submit Button
Then I should be taken to the Succesful Submission Page.