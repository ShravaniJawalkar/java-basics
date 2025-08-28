package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Tasks {
    private final List<Tasks> taskL = new ArrayList<>();
    private final String taskListName;

    public TaskList(String taskListName) {
        this.taskListName = taskListName;
    }

    public void setTasks(Tasks tasks) {
        taskL.add(tasks);
    }

    @Override
    public void display() {
        System.out.println(taskListName);
        for (Tasks task : taskL) {
            task.display();
        }

    }
}
