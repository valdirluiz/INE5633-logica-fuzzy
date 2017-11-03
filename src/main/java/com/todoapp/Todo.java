package com.todoapp;

import java.util.Date;

/**
 * Created by shekhargulati on 09/06/14.
 */
public class Todo {

    private String id;
    private String title;
    private boolean done;
    private Date createdOn = new Date();

    public Todo( ) {
        
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
}
