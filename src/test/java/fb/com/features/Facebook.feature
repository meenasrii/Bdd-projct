
Feature: facebook login functional-Automation

Background:
Given User Launch Chrome Browser 
And user Website url
And User Verify login page landed

@Facebook-Fb101
  Scenario: Login with valid detail
    Given User Launch Chrome Browser
    And User Navigate Url
    And User Verify page land on LoginPage
    And User Enter Valid Username
    And User Enter Valid Password
    And User Click Login Button
    Then User Verify Loged in Successfull
    
@Adctin-tc101
Scenario:Adactin login with invalid details
#Given User Launch Chrome Browser 
#And user Website url
#And User Verify login page landed
And User Enter UserName "valid Usename"
And User Enter  passWord "Invalid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired." 
And User Enter UserName "Invalid Usename"
And User Enter  passWord "valid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired."
And User Enter UserName "Invalid Usename"
And User Enter  passWord "Invalid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired."

@Adctin-tc102
 Scenario Outline: Adactin Login with Invalid Id
 And User Enter UserName <UserName>
 And User Enter passWord <passWord>
 And User Click login button
 Then User Verify Error Message "Invalid Login details or Your Password might have expired."
  
Examples:
 | UserName|passWord |
 |"valid Usename"|"Invalid Password"|
 |"Invalid Usename"|"valid Password"|
 |"Invalid Usename"|"Invalid Password"|
 