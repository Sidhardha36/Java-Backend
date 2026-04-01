//  Triangle.java

public class Triangle extends AbstractShape {
    private final double a,b,c;

    public Triangle(String color,double a,double b,double c){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area() {
        double s=perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double perimeter() {
        return a +b +c;
    }
}
