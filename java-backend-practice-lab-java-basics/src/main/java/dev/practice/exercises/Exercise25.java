package dev.practice.exercises;

import dev.practice.models.Employee;

public class Exercise25 {

    public static void run() {
        Employee employee = new Employee("Sarah Jones", "Junior Developer", 40000.0, "Engineering");

        employee.giveRaise(10.0);
        employee.changeRole("Backend Developer");
        employee.printSummary();
    }
}
