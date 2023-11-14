import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private int id;
    private Map<String, Double> grades;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }
    public void addGrade(String course, double grade) {
        grades.put(course, grade);
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public char calculateOverallGrade() {
        double averageGrade = calculateAverageGrade();
        if (averageGrade > 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }

    private double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }


}