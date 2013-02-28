# Spark Servlet Example

[![Build Status](https://travis-ci.org/simonrice/SparkServletExample.png)](https://travis-ci.org/simonrice/SparkServletExample)

This is a simple example of a Spark (Java Micro MVC Framework) application running in a servlet container, namely Jetty.  It is fully set up to run on Heroku, & you can view it running at http://spark-servlet.herokuapp.com/.

## Running Locally

The easiest way to run the example is to type `mvn jetty:run` in the terminal.  Alternatively, you can use the same Jetty runner that is used on Heroku by typing in `java -jar target/dependency/jetty-runner.jar target/*.war`.

## Contributions

As everyone says, GitHub is about social coding - I didn't just choose to use it because of my love of git as a version control system.  Please do chip in & help make this even better.

## License

This example is provided under the terms of my very permissive Boozeware license (since I often prefer to have white wine over beer):

> As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me an alcoholic beverage in return.

See the `LICENSE` file or any class file for the full details.
