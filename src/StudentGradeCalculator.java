import java.util.Map;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        // Create a student object
        Student student = new Student(name, id);

        // Enter grades for each course
        for (String course : new String[]{"Math", "English", "Computer Science", "Computer Engineering"}) {
            System.out.print("Enter grade for " + course + ": ");
            double grade = scanner.nextDouble();
            student.addGrade(course, grade);
        }

        // Display student information and overall grade
        System.out.println("Student Information:");
        System.out.println("==============================");
        System.out.println("Name : " + student.getName());
        System.out.println("ID : " + student.getId());
        System.out.println("Course & Grades:");
        System.out.println("==============================");
        Map<String, Double> studentGrade= student.getGrades();
        studentGrade.forEach((course,grade)-> System.out.println("Course : " + course + " : " + grade));
        System.out.println("==============================");
        System.out.println("Overall Grade: " + student.calculateOverallGrade());
        System.out.println("==============================");

        scanner.close();
    }
}