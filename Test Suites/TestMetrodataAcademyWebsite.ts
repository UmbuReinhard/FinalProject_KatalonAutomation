<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>1. Pre-Testing Setup&#xd;
Define Test Cases: Identify and document test cases for the entire flow, including edge cases.&#xd;
Select Tools: Choose the appropriate tools for automation (e.g., Selenium, Cypress).&#xd;
Set Up Test Environment: Ensure the test environment mimics the production environment as closely as possible.&#xd;
2. Before Login (No Account)&#xd;
Open the Website:&#xd;
&#xd;
Verify the website loads correctly.&#xd;
Check for the presence of key elements (e.g., homepage, menus).&#xd;
Navigate to Registration Page:&#xd;
&#xd;
Locate and click the &quot;Sign Up&quot; or &quot;Register&quot; button/link.&#xd;
Verify the registration page loads.&#xd;
Registration Process:&#xd;
&#xd;
Input valid registration details (e.g., username, email, password).&#xd;
Check validation messages for invalid input (e.g., weak passwords, invalid email formats).&#xd;
Submit the registration form.&#xd;
Verify account creation success message or email confirmation prompt.&#xd;
Email Verification (if applicable):&#xd;
&#xd;
Simulate or manually verify the confirmation email.&#xd;
Complete the email verification process.&#xd;
3. Login Process&#xd;
Navigate to Login Page:&#xd;
&#xd;
Locate and click the &quot;Login&quot; or &quot;Sign In&quot; button/link.&#xd;
Verify the login page loads.&#xd;
Login with Newly Created Account:&#xd;
&#xd;
Input valid login credentials (username/email and password).&#xd;
Check for validation messages on invalid credentials.&#xd;
Submit the login form.&#xd;
Verify successful login and redirection to the appropriate page (e.g., dashboard).&#xd;
4. After Login (Post-Login Activities)&#xd;
Dashboard/Welcome Page:&#xd;
&#xd;
Verify the presence of personalized content (e.g., username, welcome message).&#xd;
Check for the presence of key elements (e.g., navigation menus, main features).&#xd;
Perform Core Functionalities:&#xd;
&#xd;
Test main features accessible after login (e.g., creating a post, updating profile, accessing services).&#xd;
Verify data integrity and correct responses for each feature.&#xd;
Log Out:&#xd;
&#xd;
Locate and click the &quot;Logout&quot; button/link.&#xd;
Verify successful logout and redirection to the homepage or login page.&#xd;
5. Error and Edge Case Handling&#xd;
Invalid Registration Attempts:&#xd;
&#xd;
Test with duplicate emails, weak passwords, and incomplete forms.&#xd;
Verify correct error messages and handling.&#xd;
Invalid Login Attempts:&#xd;
&#xd;
Test with incorrect usernames/emails and passwords.&#xd;
Verify correct error messages and handling.</description>
   <name>TestMetrodataAcademyWebsite</name>
   <tag></tag>
   <delayBetweenInstances>2</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>3</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/NoAccountTest</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/LoginProcessTest</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/DashboardActivities</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/ErrorEdgeCaseHandling</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
