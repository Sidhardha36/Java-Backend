// Shape.java -- This is an interface -it starts from here.

public interface Shape{
    double area();
    double perimeter();


    default String describe() {
        return String.format("%s  -> area=%.2f,perimeter=%.2f",getClass().getSimpleName(),area(),perimeter());
    }
}
