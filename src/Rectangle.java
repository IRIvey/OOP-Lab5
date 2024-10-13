public class Rectangle implements Shape {
    private double width, height;
    private int x, y;

    public Rectangle(double width, double height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return width * height;
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