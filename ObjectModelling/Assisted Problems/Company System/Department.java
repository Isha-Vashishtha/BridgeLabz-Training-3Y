package CompanySystem;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}
