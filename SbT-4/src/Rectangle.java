public class Rectangle extends Figure implements Drawable {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    private Point vertex4;
//
    public Rectangle(Point vertex1, Point vertex2, Point vertex3, Point vertex4) {
        super(vertex1);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        this.vertex4 = vertex4;
    }
    public double sideLength(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public double area() {
        double a = sideLength(vertex1, vertex2);
        double b = sideLength(vertex2, vertex3);
        return a * b;
    }

    @Override
    public double perimeter() {
        return  2 * (sideLength(vertex1, vertex2) + sideLength(vertex2, vertex3));
    }

    public String getVertex1() {
        int a = vertex1.getX();
        int b = vertex1.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }
    public String getVertex2() {
        int a = vertex2.getX();
        int b = vertex2.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }
    public String getVertex3() {
        int a = vertex3.getX();
        int b = vertex3.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }
    public String getVertex4() {
        int a = vertex4.getX();
        int b = vertex4.getY();
        String res = "(" + String.valueOf(a) + ", " + String.valueOf(b) + ")";
        return res;
    }
//
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle with black color and (points: " + getVertex1() + ", "+ getVertex2() + ", " + getVertex3() + ", " + getVertex4() + ")");

    }
    @Override
    public void draw(Color color){
        System.out.println("Drawing Rectangle with " + color + " " + "and (points: " + getVertex1() + ", "+ getVertex2() + ", " + getVertex3() + ", " + getVertex4() + ")");
    }
}