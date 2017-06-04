Saha Bilgi Teknolojileri
------------------------
 -3 scenarios have been automated for gittigidiyor.com

Project Environment
-----------------------
 -The project was developed in the Eclipse IDE.The project has been automated with Selenium Webdriver using Java, Maven and JUnit.
 -Java library JavaSE-1.8
 -Selenium-java 3.4.0
 -Junit 4.12
 -Operating System Win 7/64 Bit
 -Maven compiler plugin 1.8
 -The project was developed based on the Page object pattern structure.
 -There are 3 different scenarios in the project; Register,login and search.
 
Example for Register action
------------------------
  -You can perform the register test using the following data
  -Username ="Ali"
  -UserSurname="Mert"
  -UserEmail="ali.mert@betatest.com"
  -UserNickName="AAMert"
  -UserPassword="123456ab" 
  -GsmCode="555"
  -PhoneNumber"5555555"
  -SubmitForm
  
Importing the project into the Eclipse IDE
--------------------------
  -You should import the project into eclipse as maven project.
  -You should change the chromedriver path which is in SetUp() function under UserAction.java
   Change the code below as where is your chromedriver.
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\emrah\\workspace\\gittigidiyor\\resources\\chromedriver.exe");
  -To run the project, you need to run the UserAction.java class run as junit.

