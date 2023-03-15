package com.incture.interview.P25_02_2023;

import java.util.Arrays;
import java.util.HashSet;

class Employee {
    private final String empName;
    private final int jobLevel;

    public Employee(String empName, int jobLevel) {
        this.empName = empName;
        this.jobLevel = jobLevel;
    }

    @Override
    public int hashCode() {
        return jobLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return empName.equals(other.empName);
    }

    @Override
    public String toString() {
        return "[" + empName + ", " + jobLevel + "]";
    }
}

public final class HashCodeEquals {
    public static void main(String[] args) {
        contractViolation();
    }

    private static void contractViolation() {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("ABC", 6);
        employee[1] = new Employee("ABC", 5);
        employee[2] = new Employee("XYZ", 6);
        employee[3] = new Employee("DEF", 5);
        employee[4] = new Employee("PQR", 4);
        HashSet<Employee> employeeSet = new HashSet<>(
                Arrays.asList(employee));
        System.out.print("Employee details: " + employeeSet.toString());
    }
}