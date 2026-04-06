
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){

        List<Person> people=List.of(
            new Person("Siddhardha",11),
            new Person("Rudra",21),
            new Person("Hanu",22),
            new Person("Venkata",23),
            new Person("Narasimha",25)
        );

        // Filter only age  (age>=18)
        List<Person> adults=people.stream().filter(p -> p.getAge() >=18).collect(Collectors.toList());
        System.out.println("-Adults-");
        adults.forEach(System.out::println);

        // Filter only minors (age < 18)
        List<Person> minors=people.stream().filter(p -> p.getAge() <18).collect(Collectors.toList());
        System.out.println("\n -Minors- ");
        minors.forEach(System.out::println);

        // Filter + Sort by age
        System.out.println("- Adults sorted by age");
        people.stream().filter(p -> p.getAge() >=18).sorted((p1,p2) -> p1.getAge() - p2.getAge()).forEach(System.out::println);

    }
}
