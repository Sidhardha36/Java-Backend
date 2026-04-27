public class Student {
    private String name;
    private int rollNumber;
    private double gpa;
    private String grade;


    public Student(String name,int rollNumber,double gpa){
        this.name=name;
        this.rollNumber=rollNumber;
        this.gpa=gpa;
    }

    public String getName() {return name};
    public int getrollNumber() {return rollNumber};
    public double getgpa()  { return gpa};
    public String getgrade() {return grade};

    public void setgrade(String grade) {this.grade=grade};

    @Override
    public String toString() {
        return String.format("%-15s | Roll: %3d | GPA: %.2f | Grade: %s",name, rollNumber, gpa, grade);
    }
    
}

