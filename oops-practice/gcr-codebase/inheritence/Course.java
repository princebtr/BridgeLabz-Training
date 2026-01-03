// Base class
class Course {
    protected String courseName;
    protected int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Full Stack MERN",12,"Udemy",true,9999,20);
        course.displayCourseDetails();
    }
}

// Level 2
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// Level 3
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

