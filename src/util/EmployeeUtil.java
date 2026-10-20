package util;

import java.util.List;

public final class EmployeeUtil {

    private EmployeeUtil() {
        // Utility class: prevent instantiation
    }

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(101, "Aarav", "Engineering", "Developer", 85000, 27, 4, true),
                new Employee(102, "Priya", "HR", "HR Manager", 75000, 32, 8, true),
                new Employee(103, "Rohan", "Engineering", "Tech Lead", 125000, 35, 11, true),
                new Employee(104, "Sneha", "Finance", "Analyst", 65000, 26, 3, true),
                new Employee(105, "Vikram", "Engineering", "Developer", 95000, 29, 6, false),
                new Employee(106, "Ananya", "Marketing", "Marketing Manager", 105000, 34, 10, true),
                new Employee(107, "Kabir", "Finance", "Finance Manager", 115000, 38, 13, true),
                new Employee(108, "Isha", "Engineering", "QA Engineer", 70000, 25, 2, true),
                new Employee(109, "Arjun", "HR", "Recruiter", 55000, 28, 5, false),
                new Employee(110, "Meera", "Marketing", "Designer", 72000, 27, 4, true),

                new Employee(111, "Dev", "Engineering", "Architect", 150000, 40, 16, true),
                new Employee(112, "Nisha", "Finance", "Accountant", 68000, 30, 7, true),
                new Employee(113, "Rahul", "Sales", "Sales Executive", 60000, 25, 2, true),
                new Employee(114, "Pooja", "Sales", "Sales Manager", 110000, 36, 12, true),
                new Employee(115, "Karan", "Engineering", "Developer", 90000, 31, 7, true),
                new Employee(116, "Divya", "HR", "HR Executive", 58000, 24, 1, true),
                new Employee(117, "Aditya", "Finance", "Financial Analyst", 82000, 29, 5, false),
                new Employee(118, "Riya", "Marketing", "Content Strategist", 78000, 28, 5, true),
                new Employee(119, "Manish", "Sales", "Sales Executive", 67000, 27, 3, true),
                new Employee(120, "Kavya", "Engineering", "QA Engineer", 75000, 28, 4, true),

                new Employee(121, "Siddharth", "Engineering", "Tech Lead", 135000, 37, 12, true),
                new Employee(122, "Neha", "HR", "Recruiter", 62000, 30, 6, true),
                new Employee(123, "Varun", "Finance", "Finance Manager", 120000, 39, 14, true),
                new Employee(124, "Tanya", "Marketing", "Marketing Executive", 65000, 25, 2, false),
                new Employee(125, "Akash", "Sales", "Sales Director", 160000, 42, 18, true)
        );
    }
}
