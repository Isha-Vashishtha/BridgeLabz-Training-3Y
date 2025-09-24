package CompanySystem;

public class Employee {
    private String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public void showEmployee() {
        System.out.println("Employee: " + empName);
    }
}
