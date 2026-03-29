public class Dog {
    String name;
    String breed;

    void display() {
        System.out.println(name+" is a "+ breed);
    }



    public class Main {

        Dog d1=new Dog();

        public Main() {
        }

        
        d1.name="Jamie";
        d1.breed="German shepherd";

        d1.display();
    }
}
