package streams;

import util.Employee;
import util.EmployeeUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamImpl {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployees();

        // Filter amount of salary greater than X
        int x = 100000;
        List<Integer> list =  employees.stream()
                .filter(e -> e.getSalary()>x)
                .map(e->(int)e.getSalary())
                .toList();
        list.forEach(System.out::println);


        // Filter name and age of employees with age < 35
        List<List<Object>> employeeAge = employees.stream()
                .filter(e -> e.getAge()>35)
                .map(e->List.<Object>of(e.getName(),e.getAge()))
                .toList();
        employeeAge.forEach(System.out::println);


        // Find second-largest non-repeating element
        List<Integer> numbers = Arrays.asList(1, 20, 7, 4, 5, 6, 7, 8, 9, 9, 10, 10);

        Integer value = numbers.stream()
                        .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue()==1)
                        .map(Map.Entry::getKey)
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null);
        System.out.println(value);
    }
}
