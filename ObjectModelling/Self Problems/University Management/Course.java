package UniversityManagement;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public String getCourseName() {
        return courseName;
    }
}
