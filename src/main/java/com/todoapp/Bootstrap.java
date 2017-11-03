package com.todoapp;

import static spark.SparkBase.setIpAddress;
import static spark.SparkBase.setPort;
import static spark.SparkBase.staticFileLocation;

 
public class Bootstrap {
	private static final String IP_ADDRESS = "localhost";
	private static final int PORT = 8081;

	public static void main(String[] args) throws Exception {
		setIpAddress(IP_ADDRESS);
		setPort(PORT);
		staticFileLocation("/public");
		new TodoResource();
	}

}
