package org.example.composite;

public class TaskDemo {
    public static void main(String[] args) {
        // Example usage of the Task class
        Tasks task1 = new Task("Sub Task1");
        Tasks subTask2 = new Task("Sub Task2");
        TaskList task2 = new TaskList("Parent Task");
        task2.setTasks(task1);
        task2.setTasks(subTask2);

        task2.display();
    }
}
