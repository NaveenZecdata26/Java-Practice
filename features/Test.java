package features;

import sun.awt.X11.ColorEntry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    int id;

    int salary;
    String name;
    String manager;
    int department_id;

    public Emp(int id, String name, int salary, String manager, int department_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.manager = manager;
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", department_id=" + department_id +
                '}';
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

}

public class Test {


    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(  new Emp(1, "Alice", 75000, "John", 101),
                new Emp(2, "Bob", 55000, "Sara", 102),
                new Emp(3, "Charlie", 80000, "John", 101),
                new Emp(4, "David", 60000, "Nina", 103),
                new Emp(5, "Eva", 7200, "Sara", 102),
                new Emp(6, "Frank", 50000, "Nina", 103),
                new Emp(7, "Grace", 9000, "John", 101),
                new Emp(8, "Hannah", 65000, "Nina", 10));

        double average_salary = list.stream().mapToInt(Emp::getSalary).average().orElse(0.0);
        System.out.println("average_salary = " + average_salary);
        List<Emp> emp1 = list.stream().filter(emp -> emp.getSalary() > average_salary).collect(Collectors.toList());
        System.out.println("emp = " + emp1);
        Map<String, List<Emp>> collect = emp1.stream().collect(Collectors.groupingBy(Emp::getManager));
        System.out.println("collect = " + collect);

    }
}
