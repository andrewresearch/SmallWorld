SmallWorld
==========

Analysis of Twitter timelines - followers of followers

Original Code
-------------

This app is a webapp version of the original code by Guido Zuccon. 

Overview
---------

SmallWorld is a Spring-boot web app written in Java using the Spring framework. It uses the gradle build tool and has been developed using Intellij IDEA, although it should be able to be openned directly in eclipse.

As is, it produces a runnable Jar file file with an embedded Tomcat that can be reached at http://localhost:8080/

The primary purpose of the app is to interact with the Twitter API, to retrieve followers of followers, and to analyse the timelines of those users.

Current
-------

Currently implemented is: 
  - a very basic web front end
  - retrieving timelines of followers of followers
  - an embedded H2 database with repositories (currently not used) that emulates mysql

Next
----

Features to come next:
  - Basic LDA analysis of timelines
