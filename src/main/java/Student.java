import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {

    private final String name;
    private final int sID;
    private int age;
    private String department;
    private CoursesOffered offeredCourse;

}
