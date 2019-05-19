# QA Automation Framework
This is an example of framework to execute automations in android mobile web. The framework is ready too for execute farms of mobiles, of android and ios devices. 

The architecture of the framework is the suggested by selenium, named Page Object, with small differences, to make more productive the generation of code and make more easy to make the maintenance, this help a lot to safe time at the moment to have a lot of differents scenarios and tests in mobile, web and backend. 


## Used tools
 - Java
 - Maven
 - Cucumber
 - Selenium Webdriver
 - TestNG
 - Appium  

## Preconditions
- install Java 8
- install Maven
- install Git
- install Appium
- install Adb (android development kit)

## Maven parameters:

Mandatories:

parallel: 

This framework is prepared to execute farm of devices, or farm of browsers. This is very usefull when you have multiple SO and with different Browsers, or devices to test. In this version of the framework is not activated.


## How to run tests localy

in the directory of project make:
mvn eclipse:eclipse
mvn clean compile

To execute the example:

mvn package -Dparallel=false -Dcucumber.options="--tags @Case_2A1"


