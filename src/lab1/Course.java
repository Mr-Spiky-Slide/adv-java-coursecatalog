package lab1;

import javax.swing.*;

public abstract class Course {
    private final String courseName;
    private final String courseNumber;
    private final double credits;
    private final String prerequisites;

    //I tried it ;)

    public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
        if (credits <= 0.5 || credits >= 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }



    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }
}
