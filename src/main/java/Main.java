import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Course c1 = new Course("java101", "intro java", 5, 95);
        Course c2 = new Course("Spring102", "intro Spring", 3, 77);

        Student stud = new Student("AY", 101, 18, "CS");
        stud.setOfferedCourse(c1);
        stud.setOfferedCourse(c2);
        stud.printGPA();

    }
}
