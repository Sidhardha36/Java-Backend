import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class GradeManager{
    private ArrayList<Student> student;
    private HashMap<String,String> gradeChart;

    public GradeManager() {
        student=new ArrayList<>();
        
        gradeChart=new HashMap<>();
        gradeChart.put("O", "gpa 9.0-10.0    Outstanding");
        gradeChart.put("A+", "gpa 8.0-8.9    Excellent");
        gradeChart.put("A", "gpa 7.0-7.9     Very Good");
        gradeChart.put("B+", "gpa 6.0-6.9    Good");
        gradeChart.put("B", "gpa 5.0-5.9     Average");
        gradeChart.put("F", "gpa below 5.0    Fail");
    }

    public void addStudent(Student s){
        s.setgrade(assignGrade(s.getgpa()));
        students.add(s);
    }

    private String assignGrade(double gpa){
        if(gpa >= 9.0) return "O";
        if(gpa >= 8.0) return "A+";
        if(gpa >= 7.0) return "A";
        if(gpa >= 6.0) return "B+";
        if(gpa >= 5.0) return "B";
        else return "Fail";
    }
  
    // Print all students 
    public void printall() {
        System.out.println("---- All Students ----");
        for(Student s: students){
            System.out.println(s);
        }
    }

    // Sort by GPA desc using Comparator
    public void sortByGPA() {
        Collections.sort(students,
            Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Sort by name alphabetically
    public void sortByName() {
        Collections.sort(students,
            Comparator.comparing(Student::getName));
    }

    // Grade lookup using HashMap
    public void lookupGrade(String grade) {
        String info = gradeChart.get(grade);
        if (info != null) {
            System.out.println("Grade " + grade + " → " + info);
        } else {
            System.out.println("Grade not found!");
        }
    }

    // Topper
    public Student getTopper() {
        return Collections.max(students,
            Comparator.comparingDouble(Student::getGpa));
    }

    // Students below 5.0 GPA
    public void printFailingStudents() {
        System.out.println("\n--- Failing Students ---");
        students.stream()
                .filter(s -> s.getGpa() < 5.0)
                .forEach(System.out::println);
    }




}