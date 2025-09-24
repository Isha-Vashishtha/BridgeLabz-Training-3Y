package UniversityManagement;

public class MainUniversityMgmt {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");

        Course c1 = new Course("AI");
        Course c2 = new Course("ML");

        p1.assignProfessor(c1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c2);
    }
}
