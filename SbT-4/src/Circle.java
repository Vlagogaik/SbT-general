public class Circle extends Figure implements Drawable{
    private double radius;
//
    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
//
    @Override
    public void draw(){
        System.out.println("Drawing circle with black color and center at (x: " + getCenter().getX() + ", y: " + getCenter().getY() + ")" + " radius: " + getRadius());
    }
    @Override
    public void draw(Color color){
        System.out.println("Drawing circle with " + color + " and center at  ( x: " + getCenter().getX() + ", y: " + getCenter().getY() + ")" + " radius: " + getRadius());
    }
}
