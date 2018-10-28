# Spark Servlet Example

[![Build Status](https://travis-ci.org/simonrice/SparkServletExample.svg)](https://travis-ci.org/simonrice/SparkServletExample)

This is a simple example of a Spark (Java Micro MVC Framework) application running in a Tomcat container.

Spark "official" container is Jetty and this example is to show how to run it in Tomcat.

This example has been checked to run correctly on

- Tomcat 8
- Java 8

## Running Locally

The easiest way to run the example is to type `mvn clean package` in the terminal.

You will get a `target/sparkServletExample.war` that you will deploy either by uploading it through the web interface or by copying it to the `webapps/` directory.

## Contributions

As everyone says, GitHub is about social coding - I didn't just choose to use it because of my love of git as a version control system.  Please do chip in & help make this even better.

## License

This example is provided under the terms of my very permissive Boozeware license (since I often prefer to have white wine over beer):

> As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me an alcoholic beverage in return.

See the `LICENSE` file or any class file for the full details.
