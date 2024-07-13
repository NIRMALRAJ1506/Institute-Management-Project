#Nirmal Raj S
#10/07/24

Feature: Login Page automation of Institute Management application
  

 
  Scenario: Check Home Page is successful
    Given User is on Home page
    When User clicks on AboutUs button
    When User clicks on Placements button
   	When User clicks on Departments button
    When User clicks on ContactUs button
  
	Scenario: Check Login is successful with valid credentials
    Given User is on the home page
    And clicks on navigate login button
    Then user is navigated to the login page
    When User enters valid "<username>" and "<password>" and "<usertype>"
    Then clicks on login button
    
    Examples: 
      | username  | password | usertype| home |
      | student | student | Student | Dear Student Welcomeback |

   Scenario: Check User is on Student Login
    Given User is on the Student home page
    And clicks on navigate Student Database button
    Then clicks on Add student button
    When students enters valid "<sr>" and "<sn>" and "<sd>" and "<scn>" and "<se>" and "<sg>" and "<sdob>" and "<sa>" and "<sp>"
    Then clicks on edit button
    Then clicks on delete button
    Then clicks on logout button
    Examples: 
      | sr | sn | sd| scn | se| sg | sdob| sa | sp|
      | a | a | a | 9999999999 |a | a | 21/12/2001 | a |a|
      
      
  
	 Scenario: Check Login is successful with valid credentials
    Given User is on the home page
    And clicks on navigate login button
    Then user is navigated to the login page
    When User enters valid "<username>" and "<password>" and "<usertype>"
    Then clicks on login button
    
    Examples: 
      | username  | password | usertype| home |
      | trainer | trainer | Trainer | Dear Trainer Welcomeback |  
      
      
 	Scenario: Check User is on Trainer Login
    Given User is on the Trainer home page
    And clicks on navigate Student Database button
    Then clicks on Add student button
    When students enters valid "<sr>" and "<sn>" and "<sd>" and "<scn>" and "<se>" and "<sg>" and "<sdob>" and "<sa>" and "<sp>"
    Then clicks on edit button
    Then clicks on delete button
    Then Clicks on courses database button
    Then Clicks on courses add button
    When User is on courses add page "<cid>" and "<cn>" and "<ct>" and "<cd>"
    Then clicks on course edit button  
    Then clicks on course delete button 
    Then clicks on trainer logout button
    
    Examples: 
      | sr | sn | sd| scn | se| sg | sdob| sa | sp|cid|cn|ct|cd|
      | a | a | a | 9999999999 |a | a | 21/12/2001 | a |a|b|b|b|5|
      
      
      
      
  Scenario: Check Login is successful with valid credentials
    Given User is on the home page
    And clicks on navigate login button
    Then user is navigated to the login page
    When User enters valid "<username>" and "<password>" and "<usertype>"
    Then clicks on login button
    
    Examples: 
      | username  | password | usertype| home |
      | admin | admin | Admin | Dear Admin Welcomeback |  
          
          
  Scenario: Check user is on Admin Login
  Given User is on the Admin home page
  And clicks on navigate Student Database button
  Then Admin clicks on Add student button
  When Admin enters valid "<sr>" and "<sn>" and "<sd>" and "<scn>" and "<se>" and "<sg>" and "<sdob>" and "<sa>" and "<sp>"
  Then Admin clicks on edit button
  Then Admin clicks on delete button
  Then Admin Clicks on courses database button
  Then Admin Clicks on courses add button
  When Admin is on courses add page "<cid>" and "<cn>" and "<ct>" and "<cd>"
  Then Admin clicks on course edit button  
  Then Admin clicks on course delete button
  Then Admin clicks on Trainer database button
  Then clicks on add admin button 
  When Admin enters valid "<tid>" and "<tn>" and "<tc>" and "<te>" and "<td>" 
  Then Admin clicks on edit trainer button
  Then Admin clicks on delete trainer button
  Then Admin clicks on contact list button
  Then Admin clicks on delete contact button
  Then clicks on Admin logout button
  
   Examples: 
      | sr | sn | sd| scn | se| sg | sdob| sa | sp|cid|cn|ct|cd|tid|tn|tc|te|td|
      | a | a | a | 9999999999 |a | a | 21/12/2001 | a |a|b|b|b|5|c|c|c|c|c|
  
      
      
    