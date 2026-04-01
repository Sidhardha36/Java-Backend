// Rectangle.java

public class Rectangle extends AbstractShape {
    private final double width,height;
    
    public Rectangle(String color,double width,double height){
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return (width * height);
    }
    
    @Override
    public double perimeter() {
        return 2 * (width+height);
    }
}
