public class Main {
    public static void main(String args[]){

        GradeManager  manager=new GradeManager();

        // Adding Students
        manager.addStudent(new Student("Sidhardha",9.2));
        manager.addStudent(new Student("Rudra",9.8));
        manager.addStudent(new Student("Hanu",8.3));
        manager.addStudent(new Student("Narasimha",7.1));
        manager.addStudent(new Student("VenkataRamana",6.0));
        manager.addStudent(new Student("Varma",5.2));

        // Print all students
        manager.printall();

        // Sort by gpa
        System.out.println("--- Sort by GPA ---");
        manager.sortByGPA();
        manager.printall();

        // Sort by name
        System.out.println("--- Sort by Name ---");
        manager.sortByName();
        manager.printall();

        // Topper
        System.out.println("\n--- Topper ---");
        System.out.println(manager.getTopper());

        // Failing students
        manager.printFailingStudents();

        // Grade lookup
        System.out.println("\n--- Grade Chart Lookup ---");
        manager.lookupGrade("O");
        manager.lookupGrade("A+");
        manager.lookupGrade("F");
    }
}
