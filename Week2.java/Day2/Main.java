public class Main {
    public static void main(String args[]){

        // Using String + Integer

        Pair<String,Integer> person=new Pair<>("Sidhardha",21);
        System.out.println("\nPerson:"+ person);
        System.out.println("Name:"+ person.getFirst());
        System.out.println("Age:"+ person.getSecond());

        // Using String + String

        Pair<String,String> city=new Pair<>("Hyderbad","Amaravathi");
        System.out.println("\nCity:"+ city);
        System.out.println("City1:"+ city.getFirst());
        System.out.println("City2:"+ city.getSecond());

        // Using Integer + double

        Pair<Integer,Double> score=new Pair<>(1,97.7);
        System.out.println("\nScore:"+ score);
        System.out.println("Marks:"+ score.getFirst());
        System.out.println("Ranks:"+ score.getSecond());

        // Using Pair inside Pair -- Nested Pair Generics

        Pair<String, Pair<String,Integer>> student=new Pair<>("Sidhardha", new Pair<>("CSE",2026));
        System.out.println("Student:"+ student.getFirst());
        System.out.println("Branch+Year:"+ student.getSecond());

    }
}
