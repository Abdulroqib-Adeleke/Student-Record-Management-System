import lombok.AllArgsConstructor;


public class GPA {


    public double showGPA(Student student){

        GradePoint gradePoint = new GradePoint();
        if(!student.getOfferedCourses().isEmpty()){

            int WGP = 0;
            int totalCourseUnit = 0;

            for(Course course : student.getOfferedCourses()){
                WGP += gradePoint.unitScore(course);
                totalCourseUnit += course.getCourseUnit();
            }
            return (double) WGP / totalCourseUnit;
        }
        return 0.0;
    }

}
