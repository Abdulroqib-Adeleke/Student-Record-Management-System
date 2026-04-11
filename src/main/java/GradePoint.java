


public class GradePoint {

    public int unitScore(Course course){
        int result = 0;
        if(course.getGrade() >= 80){
            result = 5 * course.getCourseUnit();
        } else if (course.getGrade() >= 70) {
            result = 4 * course.getCourseUnit();
        } else if (course.getGrade() >= 60) {
            result = 3 * course.getCourseUnit();
        } else if (course.getGrade() >= 50) {
            result = 2 * course.getCourseUnit();
        } else if (course.getGrade() >= 40) {
            result = course.getCourseUnit();
        }else {
            return result;
        }
        return result;
    }
}
