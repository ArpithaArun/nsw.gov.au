# nsw.gov.au
Automated tests on publicly available web page of nsw.gov.au.

  
**Selenium Web Driver Framework using Page object pattern**   


**SETUP/ tools requirement**

I have created this project using Selenium and Java , Clone this repo or download the repo

 - Install Chrome Browser
 - Install Java  
 - Install Maven- https://maven.apache.org/   
 - Set System variables ( PATH ) to recognize Maven  and Java from any location 
 
 
**How to Run**

    mvn test ( to run all tests )
    mvn -Dtest= "testname" ( to run a single test )
    
**Test Report**

![Report](/src/test/resources/report.png)
    mvn verify

Run this command to run tests and generate report

The reports will be created in target/cucumber-reports/advanced-reports/ folder


Information  
1. I have written generic methods wherever possible  
2. I have used helpers wherever needed to make the test Code more readable .  


  
  
IMPROVEMENTS THAT CAN BE DONE :  
  
1. More data driven tests can be written .  
2. Cross Browser testing can be done.  
4. Remove dependency of updating chromedriver path by downloading and uploading it on the run  
  
Who do I talk to? Arpitha: arpitha.a1991@gmail.com 0481846810
