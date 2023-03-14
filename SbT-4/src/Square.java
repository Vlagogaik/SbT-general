public class Square extends Rectangle implements Drawable{
    private Point svertex1;
    private Point svertex2;
    private Point svertex3;
    private Point svertex4;
//
    public Square(Point vertex1, Point vertex2, Point vertex3, Point vertex4) {
        super(vertex1, vertex2, vertex3, vertex4);
        this.svertex1 = vertex1;
        this.svertex2 = vertex2;
        this.svertex3 = vertex3;
        this.svertex4 = vertex4;
    }
    @Override
    public double area() {
        double a = sideLength(svertex1, svertex2);
        return a * a;
    }

    @Override
    public double perimeter() {
        return  4 * sideLength(svertex1, svertex2);
    }
//
    @Override
    public void draw(){
        System.out.println("Drawing Square with black color and (points: " + getVertex1() + ", "+ getVertex2() + ", " + getVertex3() + ", " + getVertex4() + ")");
    }
    @Override
    public void draw(Color color){
        System.out.println("Drawing Square with " + color + " " + "and (points: " + getVertex1() + ", "+ getVertex2() + ", " + getVertex3() + ", " + getVertex4() + ")");
    }
}
