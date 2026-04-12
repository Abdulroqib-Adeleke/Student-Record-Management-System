public class GradeCalculator {

    public void gradeConverter(Course course){

        if(course.getCourseScore() >= 80){
            course.setGrade('A');
        }else if (course.getCourseScore() >= 70){
            course.setGrade('B');
        }else if (course.getCourseScore() >= 60){
            course.setGrade('C');
        }else if (course.getCourseScore() >= 50){
            course.setGrade('D');
        }else if (course.getCourseScore() >= 40){
            course.setGrade('E');
        }else {
            course.setGrade('F');
        }
    }
}
