<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Open the Website:&#xd;
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
Complete the email verification process.</description>
   <name>NoAccountTest</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>57acf65b-17c6-41a2-8736-7eea7f34f6b9</testSuiteGuid>
   <testCaseLink>
      <guid>b84f634d-0fa8-4d24-b458-112a3b84b638</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TampilanSebelumLogin/Normal_LihatProgramHomepage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>bdcb5e99-1299-4089-9871-28775ce0f0d4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TampilanSebelumLogin/Normal_DropdownProgram</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a3dcecaf-0b2b-42fc-a71e-ef4469fb75fb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Daftar/Normal_Daftar</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>895142e6-5317-43eb-9681-4028842bee13</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Registration/RegistData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>895142e6-5317-43eb-9681-4028842bee13</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Nama</value>
         <variableId>e7b40149-3962-4c41-a7c8-82ff282af2a2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>895142e6-5317-43eb-9681-4028842bee13</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Email</value>
         <variableId>856c7c1f-bc03-4329-b44c-88b4505dbc84</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>895142e6-5317-43eb-9681-4028842bee13</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>71a7e7d6-e956-4d99-8e6d-b63a9f869253</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>895142e6-5317-43eb-9681-4028842bee13</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ConfirmPassword</value>
         <variableId>0640c6f1-cfd5-4eea-8c40-4326b29b59b7</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
