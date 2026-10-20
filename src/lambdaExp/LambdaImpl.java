package lambdaExp;

import util.Employee;
import util.EmployeeUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaImpl {


    public static void main(String[] args) {

        // Sorting employees based on salary using Lambda exp
        // and providing method implementation directly to sort method
        /*List<Employee> employees = new ArrayList<>(EmployeeUtil.getEmployees());
        employees.sort((e1, e2) -> {
            if (e1.getSalary() > e2.getSalary()) {
                return 1;
            } else if (e1.getSalary() < e2.getSalary()) {
                return -1;
            }
            return 0;
        });
        employees.forEach(System.out::println);*/

        // Sorting employees in descending order based on salary using Lambda exp
        // and Double.compare
        /*List<Employee> employees = new ArrayList<>(EmployeeUtil.getEmployees());
        Employee employee;
        employees.sort((e1, e2) ->
            Double.compare(e2.getSalary(), e1.getSalary())); // to sort in ascending order, reverse the positions of e1 & e2

        employees.forEach(System.out::println);*/


        // Storing lambda in a variable
        /*Comparator<Employee> comparator = (e1, e2) -> {
            if (e1.getSalary() > e2.getSalary()) {
                return 1;
            } else if (e1.getSalary() < e2.getSalary()) {
                return -1;
            }
            return 0;
        };
        List<Employee> employees = new ArrayList<>(EmployeeUtil.getEmployees());
        employees.sort(comparator.reversed());  // remove .reversed to sort in ascending order
        employees.forEach(System.out::println);*/

    }
}
