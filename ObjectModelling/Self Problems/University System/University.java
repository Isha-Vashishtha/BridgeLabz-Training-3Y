package UniversitySystem;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) d.showDepartment();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.showFaculty();
        System.out.println();
    }

    public void deleteUniversity() {
        System.out.println(universityName + " is deleted with all its departments.");
        departments.clear();
    }
}
