package SchoolSystem;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }
}
