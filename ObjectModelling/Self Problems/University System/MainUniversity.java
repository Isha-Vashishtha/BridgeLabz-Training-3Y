package UniversitySystem;

public class MainUniversity {
    public static void main(String[] args) {
        University uni = new University("Oxford");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        uni.deleteUniversity();
        uni.showUniversity(); // Should show only faculties
    }
}
