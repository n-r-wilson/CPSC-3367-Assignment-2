package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    private String Description;
    private Boolean IsComplete;

    // TODO 02. Define the class constructor and the corresponding getters and setters.
    public String GetDescription() {
        return Description;
    }
    public void SetDescription(String value) {
        Description = value;
    }

    public Boolean GetIsComplete() {
        return IsComplete;
    }
    public void SetIsComplete(Boolean value) {
        IsComplete = value;
    }

    // Generic Constructor
    public Task() {
        Description = null;
        IsComplete  = false;
    }

    // Constructor with variable initialization
    public Task(String description, Boolean isComplete) {
        Description = description;
        IsComplete  = isComplete;
    }

}
