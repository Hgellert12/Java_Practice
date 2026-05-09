package dev.practice.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // TODO: Add private fields: name and scores.

    public Student(String name) {
        // TODO: Assign name and initialize scores list.
    }

    public void addScore(int score) {
        // TODO: Add score only if it is between 0 and 100.
    }

    public double getAverageScore() {
        // TODO: Return average score. Handle empty score list safely.
        return 0.0;
    }

    public int getHighestScore() {
        // TODO: Return highest score. Handle empty score list safely.
        return 0;
    }

    public boolean hasPassed() {
        // TODO: Return true if average score is at least 60.
        return false;
    }

    public void printSummary() {
        // TODO: Print student name, scores, average, highest score, and pass status.
    }
}
