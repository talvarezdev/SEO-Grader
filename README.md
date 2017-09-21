# Tony Alvarez Individual Project

This repository will have details for the SEO-Grader (Individual project for Enterprise Java Fall 2017) . 

### Problem Statement

Cuppa SEO is a company that builds and optimizes websites to improve business rankings on google searches.  In order to
obtain a contract to optimize a site the first tedious task is to review the customers current website.  There are many
things to check on each and every page.  This is a very time consuming task and it is costly.  If Cuppa SEO had a tool
that would allow them to simply supply a website URL and have it go through and automate the majority of the website
review, this would allow Cuppa SEO two key benefits.  #1 They could be sitting in a meeting or at a coffee shop with a 
potential customer and run an analysis right on the spot.  #2 Today the customer would have to sign a contract and pay
Cuppa SEO to perform a review and it would take hours upon hours of manual work just to evaluate the website and 
understand what needs to be optimized.

With the SEO-Grader we will perform analysis on multiple key factors related to SEO such as image names, alt tags, 
key words, call to action, etc.   

###  KEEPING DATA BELOW AS EXAMPLE FOR LATER UPDATING  !!!!!
Screenshots from SkinnySki.com:

![Trail Description](images/MirrorLakeTrailExample.png)

![Trail Report](images/MadisonAreaExample.png)


### Project Technologies/Techniques 

* Security/Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: submit trail reports
  * All: anyone can view trail information (no login required)
* Database (MySQL and Hibernate)
  * Store users and roles
  * Store trail information
* Web Services or APIs
  * Google Maps for trail locations
  * Weather for weather conditions at a trail location
* Jenkins (independent research topic)
* Logging
  * Configurable logging using Log4J. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Site and database hosted on AWS
* Unit Testing
  * JUnit tests to achieve 80% code coverage 

### Design

* [Screen Design](DesignDocuments/Screens.md)
* [Application Flow](DesignDocuments/applicationFlow.md)
* [Database Design](DesignDocuments/databaseDiagram.png)

### [Project Plan](ProjectPlan.md)

### [Time Log](TimeLog.md) 
### [Journal](Journal.md)# SEO-Grader