import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates;  // List of subordinates

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    // Add ลูกน้อง
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    // Remove ลูกน้อง
    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]";
    }
}
