import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course {

    private String courseCode;
    private String courseTitle;
    private int courseUnit;
    private int grade;
    private int gradePoint;

    public Course(String courseCode, String courseTitle, int courseUnit){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseUnit = courseUnit;
    }

}
