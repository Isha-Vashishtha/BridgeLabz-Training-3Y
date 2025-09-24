package CompanySystem;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompany();
    }
}
