import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class Student {


    private final String name;
    private final int sID;
    @NonNull
    private int age;
    @NonNull
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
