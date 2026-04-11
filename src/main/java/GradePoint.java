


public class GradePoint {

    public int unitScore(Course course){

        int unit = course.getCourseUnit();
        int result = 0;
        if(course.getGrade() >= 80){
            result = 5;
        } else if (course.getGrade() >= 70) {
            result = 4;
        } else if (course.getGrade() >= 60) {
            result = 3;
        } else if (course.getGrade() >= 50) {
            result = 2;
        } else if (course.getGrade() >= 40) {
            result = 1;
        }else {
            result = 0;
        }
        return result * unit;
    }
}
