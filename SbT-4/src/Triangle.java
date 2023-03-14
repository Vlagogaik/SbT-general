public class Triangle extends Figure implements Drawable{
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
//
    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        super(vertex1);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public String getVertex1() {
        int a = vertex1.getX();
        int b = vertex1.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }

    public void setVertex1(Point vertex1) {
        this.vertex1 = vertex1;
    }

    public String getVertex2() {
        int a = vertex2.getX();
        int b = vertex2.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }

    public void setVertex2(Point vertex2) {
        this.vertex2 = vertex2;
    }

    public String getVertex3() {
        int a = vertex3.getX();
        int b = vertex3.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }

    public void setVertex3(Point vertex3) {
        this.vertex3 = vertex3;
    }

    private double sideLength(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double area() {
        double a = sideLength(vertex1, vertex2);
        double b = sideLength(vertex2, vertex3);
        double c = sideLength(vertex3, vertex1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return sideLength(vertex1, vertex2) + sideLength(vertex2, vertex3) + sideLength(vertex3, vertex1);
    }
//
    @Override
    public void draw(){
        System.out.println("Drawing Triangle with black color and points (" + getVertex1() + "; " + getVertex2() + "; " + getVertex3()  + ")");
    }
    @Override
    public void draw(Color color){
        System.out.println("Drawing Triangle with " + color + " " + " and points (" + getVertex1() + "; " + getVertex2() + "; " + getVertex3()  + ")");
    }

}
