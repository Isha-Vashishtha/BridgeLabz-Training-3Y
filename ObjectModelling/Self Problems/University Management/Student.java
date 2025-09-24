package UniversityManagement;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.getCourseName());
    }

    public String getName() {
        return name;
    }
}
    