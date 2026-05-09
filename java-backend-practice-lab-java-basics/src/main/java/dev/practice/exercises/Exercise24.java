package dev.practice.exercises;

import dev.practice.models.Task;

public class Exercise24 {

    public static void run() {
        Task task = new Task("Practice Java", "Finish object modeling exercise", "HIGH");

        task.printSummary();
        task.markCompleted();
        task.printSummary();
    }
}
