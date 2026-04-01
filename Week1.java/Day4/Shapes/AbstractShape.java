// AbstractShape.java  -- This is an abstract class

public abstract class AbstractShape implements Shape {
    private final String color;

    public AbstractShape(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return describe() + ", color=" + color;
    }
}