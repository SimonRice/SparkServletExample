/*
 * ----------------------------------------------------------------------------
 * "THE BOOZE-WARE LICENSE"
 * Simon Rice wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me an alcoholic beverage in return.
 *
 * Simon Rice
 * ----------------------------------------------------------------------------
 */

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
