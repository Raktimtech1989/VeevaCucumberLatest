Feature: CP PRODUCT
  To validate and check all aspects of DP1 Product
  
  Background:
     Given I successfully setup the DP1 Product
     
  

  @Smoke
  Scenario: Successful Navigation
    Then I should be successfully navigated into DP1 Product home page

  
  @Smoke
  Scenario: DP1 Product Slides Title Validation
    And I count the total number of slides present under Tickets section
    Then I should verify the title of each slide with their expected title
    
    
  @Smoke
  Scenario: DP1 Product Slides Duration Validation
    And I count the total number of slides present under Tickets section
    Then I should be able to count the duration of each slide with expected duration
    
    
    