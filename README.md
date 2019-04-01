#### Project google__2019.03 contains:

 1) ...\google__2019.03\src\test\java\page\..:
 - StartPage class which describes StartPage pageObject for going to Google page and searching for "Selenium" search term;
 - SearchPage class which describes SearchPage pageObject for searching and calculating search term in search results;
 2) ...\google__2019.03\src\test\java\test\..:
 - BaseTest class is for executing prerequisites during every run;
 - SearchTest class is for checking search term searching, containing and counting it in search results.
 3) ...\google__2019.03\src\target\..:
 - .gitignore is the list of files which we don't want to load to GitHub;
 - pom.xml is an XML file that contains information about the project and configuration details used by Maven to build the project.
 
#### Necessary tools for the project:

* Java Development Kit (version 1.8);
* IntelliJ IDEA;
* Latest version of Google Chrome.

---
Also, need to configure IntelliJ IDEA:
* Download and add chromedriver to C:\Users\samoilenko_l\IdeaProjects\google-2019.03\chromedriver.exe;
* Add selenium dependency selenium-java, testng into POM.xml.
