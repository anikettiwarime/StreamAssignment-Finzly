import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 25, 30000, "Mumbai"),
                new Employee("Priya", 35, 50000, "Delhi"),
                new Employee("Amit", 40, 60000, "Bangalore"),
                new Employee("Sneha", 29, 45000, "Pune"),
                new Employee("Vikram", 32, 48000, "Chennai")
        );

        Iterator<Employee> iterator = employees.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        System.out.println("\nUsing Traditional For Loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName());
        }

        System.out.println("\nUsing Enhanced For Loop:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        System.out.println("\nUsing While Loop:");
        int index = 0;
        while (index < employees.size()) {
            System.out.println(employees.get(index).getName());
            index++;
        }

        List<String> filteredEmployees = employees.stream()
                .filter(e -> e.getAge() > 30 && e.getSalary() < 50000)
                .map(Employee::getName)
                .toList ();

        System.out.println("\nEmployees with age > 30 and salary < 50k: " + filteredEmployees);

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge))
                .toList ();

        System.out.println("\nEmployees sorted by Name and Age:");
        sortedEmployees.forEach(e ->
                System.out.println(e.getName() + " - Age: " + e.getAge())
        );
    }
}
