public class ShapeFactory {
    public static Shape createShape(String type, double... params) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params[0], (int)params[1], (int)params[2]);
            case "rectangle":
                return new Rectangle(params[0], params[1], (int)params[2], (int)params[3]);
            case "square":
                return new Square(params[0], (int)params[1], (int)params[2]);
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
