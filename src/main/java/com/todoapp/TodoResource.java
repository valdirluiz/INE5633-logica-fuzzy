package com.todoapp;

import static spark.Spark.post;

/**
 * Created by shekhargulati on 09/06/14.
 */
public class TodoResource {

    private static final String API_CONTEXT = "/api/v1";


    public TodoResource( ) {
        setupEndpoints();
    }

    private void setupEndpoints() {
        post(API_CONTEXT + "/todos", "application/json", (request, response) -> {
            response.status(201);
            return response;
        }, new JsonTransformer());

      
    }


}
