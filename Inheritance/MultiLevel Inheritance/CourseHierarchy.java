// Multilevel Inheritance Example 2: Educational Course Hierarchy

class Course {
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Price: $" + finalPrice);
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        Course c = new Course("Mathematics", 12);
        OnlineCourse oc = new OnlineCourse("Java Programming", 8, "Coursera", true);
        PaidOnlineCourse poc = new PaidOnlineCourse("Machine Learning", 10, "Udemy", true, 200.0, 25.0);

        c.displayCourseInfo();
        System.out.println("-----------------------------");
        oc.displayCourseInfo();
        System.out.println("-----------------------------");
        poc.displayCourseInfo();
    }
}
