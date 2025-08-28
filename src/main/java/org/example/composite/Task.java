package org.example.composite;

public class Task implements Tasks {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void display() {
        System.out.println(taskName);
    }
}
