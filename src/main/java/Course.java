import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Course {

    private final String courseCode;
    private final String courseTitle;
    private final int courseUnit;
    private int courseScore;
    private char grade;


}
