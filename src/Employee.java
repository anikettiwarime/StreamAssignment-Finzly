import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    double salary;
    String address;

    Employee(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}
