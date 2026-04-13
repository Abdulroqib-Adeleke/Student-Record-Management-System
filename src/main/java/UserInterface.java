import java.util.Scanner;

public class UserInterface {

    Scanner scan = new Scanner(System.in);
    Student student = new Student();
    Course course;

    public void start(){
        System.out.println("Welcome to Student record management portal");

        while (true){
            System.out.println("Select a function\n" +
                    "1. Enroll a student\n" +
                    "2. Add course");

            int input = scan.nextInt();

            functions(input);
            break;
        }

    }

    public void functions(int input){
        if (input == 1){
            System.out.println("Enter student name");
            String name = scan.nextLine();
            student.setName(name);
        } else if (input == 2) {
            System.out.println("Enter course code");
            String courseCode = scan.nextLine();
            System.out.println("Enter course title");
            String courseTitle = scan.nextLine();
            System.out.println("Enter course unit");
            int courseUnit = scan.nextInt();

            course = new Course(courseCode, courseTitle, courseUnit);
        }
    }
}
