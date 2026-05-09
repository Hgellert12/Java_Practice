package dev.practice.exercises;

import dev.practice.models.Student;

public class Exercise20 {

    public static void run() {
        Student student = new Student("Anna");

        student.addScore(80);
        student.addScore(95);
        student.addScore(70);

        student.printSummary();
    }
}
