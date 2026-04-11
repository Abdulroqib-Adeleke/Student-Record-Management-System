import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Course {

    private final String courseCode;
    private final String courseTitle;
    private final int courseUnit;
    private final int grade;


}
