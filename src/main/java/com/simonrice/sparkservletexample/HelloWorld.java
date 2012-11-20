package com.simonrice.sparkservletexample;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {
	@Override
	public void init() {
		Spark.get(new Route("/") {
			@Override
			public Object handle(Request request, Response response) {
				response.redirect("/hello");
				return null;
			}
		});
		
		Spark.get(new Route("/hello") {
			@Override
			public Object handle(Request request, Response response) {
				return "Hello World!";
			}
		});

		Spark.get(new Route("/hello/:name") {
			@Override
			public Object handle(Request request, Response response) {
				return  String.format("Hello, %s!", request.params(":name"));
			}
		});
	}
}
