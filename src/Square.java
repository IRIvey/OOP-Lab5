public class Square implements Shape {
    private double side;
    private int x, y;

    public Square(double side, int x, int y) {
        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return side * side;
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