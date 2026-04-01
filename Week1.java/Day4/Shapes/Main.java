// Main.java -- everthing runs here

import java.util.List;
import java.util.Comparator;

public class Main{
    public static void main(String args[]){
        List<Shape> shapes=List.of(
            new Circle("balck",2),
            new Rectangle("green", 4, 5),
            new Triangle("white", 3, 4, 5)

        );


        for(Shape s:shapes){
            System.out.println(s);
        }
        

        shapes.stream().max(Comparator.comparingDouble(Shape::area)).ifPresent(s -> System.out.println("\n Largest:"+s));

    }
}