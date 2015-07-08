# xM API - xMatters REST API

This is the new standalone xMatters API.

Requirements : Java 8 in your path.

## Getting started

1. Clone the repository 
2. cd to dir 
3. Copy application-dev-template.properties to application-dev.properties (in src/main/resources)
4. Set db settings in application-dev.properites to your local test database 
5. ./gradlew bootRun
6. Go to http://localhost:8080/metrics

This will start up the app on port 8080. 
 
You may also be interested in; 

http://localhost:8080/metrics  
http://localhost:8080/health  
http://localhost:8080/beans  
http://localhost:8080/configprops  
http://localhost:8080/env  
http://localhost:8080/dump  
http://localhost:8080/mappings  
http://localhost:8080/info  
http://localhost:8080/trace  
 
 

## Import into Idea 

- ./gradlew idea 
- open project in idea 

## Import into Eclipse 

- ./gradlew eclipse 
- open project in Eclipse 

## Run as a standalone jar 

You may also run the app as a standalone jar by building and then running the jar file. 

- ./gradlew build 
- java -jar build/libs/xM-0.1.beta.jar

## Run tests 

Rull all tests by doing; 

- ./gradlew test 