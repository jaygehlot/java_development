package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.maxBy;

public class UsingCollectors {


    public static void main(String[] args) {
        Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
        Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
        Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
        Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
        Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");

        List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);

        Double averageSalary = employees.stream().collect(Collectors.averagingDouble(value -> value.getSalary()));
        System.out.println(averageSalary);

        Double totalSalaryOfAll = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        //OR
        Double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));

        System.out.println(totalSalaryOfAll);
        System.out.println(totalSalary);

        findMaxiumumSalary(employees);


    }

    public static Double findMaxiumumSalary(final List<Employee> employees) {
        Comparator<Employee> comparator = comparingDouble(employee -> employee.getSalary());

        Collector<Employee, ?, Optional<Employee>> employeeOptionalCollector = maxBy(comparator);

        return employees.stream().collect(Collectors.collectingAndThen(employeeOptionalCollector, emp -> emp.get().getSalary()));
    }
}
