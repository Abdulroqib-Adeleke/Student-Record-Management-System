


public class GradePoint {

    public int unitScore(Course course){

        int unit = course.getCourseUnit();

        int result = switch (course.getGrade()) {
            case 'A' -> 5;
            case 'B' -> 4;
            case 'C' -> 3;
            case 'D' -> 2;
            case 'E' -> 1;
            case 'F' -> 0;
            default -> 0;
        };

        return result * unit;
    }
}
