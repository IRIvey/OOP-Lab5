public class Circle implements Shape {
    private double radius;
    private int x, y;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}