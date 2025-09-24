package UniversitySystem;

public class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}
