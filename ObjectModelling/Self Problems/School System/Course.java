package SchoolSystem;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public void showStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}
