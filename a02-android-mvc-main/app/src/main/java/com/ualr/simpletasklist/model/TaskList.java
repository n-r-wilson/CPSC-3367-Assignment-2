package com.ualr.simpletasklist.model;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // Why not just use a dynamic array like ArrayList?
    // We could delete the entries by index instead of id, and save ourselves memory and computation time...
    // Adding to a hashmap will be more complicated since we need to worry about conflicting keys, thus adding more code and increased computation time.
    private ArrayList<Task> Tasks;

    public int size() {
        return Tasks.size();
    }

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList() {
        //Tasks = new HashMap<Int, Task>();
        Tasks = new ArrayList<Task>();
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void add(String description) {
        Task task = new Task(description, false);
        Tasks.add(task);
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String toString() {
        String ret = "";
        for(int i = 0; i < Tasks.size(); i++) {
            Task task = Tasks.get(i);
            ret += i + " - " + task.GetDescription();
            if (task.GetIsComplete()) ret += " Done";
            ret += "\n";
        }
        return ret;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(int index) {
        Tasks.remove(index);
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(int index) {
        Task task = Tasks.get(index);
        task.SetIsComplete(true);
    }
}
