Feature: CP PRODUCT
  To validate and check all aspects of CP Product
  
  Background:
     Given I successfully setup the CP Product
     And I click on the X Icon
  

  @Smoke
  Scenario: Successful Navigation
    Then I should be successfully navigated into CP Product home page

  
  @Smoke
  Scenario: CP Product News & Article section page Validation
    And I click on the menu time News Features section
    Then I should be able to navigate into CP Product News Article sectrion page
    
    
  @Smoke
  Scenario: CP Product Videos Feed Validation
    And I click on the menu time News Features section
    Then I should be able to count the total number of Vidoes feed
    And I should be able to count the videos feed with filtered criteria
    
    
    