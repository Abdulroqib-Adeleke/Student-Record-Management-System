import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {


    private String name;
    private int sID;
    private int age;
    private String department;
    private List<Course>offeredCourses = new ArrayList<>();
    GPA gpa = new GPA();

    public void setOfferedCourse(Course course) {
        offeredCourses.add(course);
    }

    public void printGPA(){
        System.out.printf("%s grade point average is: %.2f%n", name, gpa.showGPA(this));
    }
}
