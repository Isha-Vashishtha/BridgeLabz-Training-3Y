package SchoolSystem;

public class MainSchool {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}
