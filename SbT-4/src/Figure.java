public abstract class Figure implements Drawable{
    protected Point center;
//
    public Figure(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public abstract double area();

    public abstract double perimeter();

}