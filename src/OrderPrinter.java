import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {

    public void printShapesInOrder(List<Shape> shapes) {
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                if (Double.compare(s1.getArea(), s2.getArea()) != 0) {
                    return Double.compare(s1.getArea(), s2.getArea());
                }
                if (Integer.compare(s1.getX(), s2.getX()) != 0) {
                    return Integer.compare(s1.getX(), s2.getX());
                }
                return Integer.compare(s1.getY(), s2.getY());
            }
        });

        for (Shape shape : shapes) {
            System.out.println(shape + " Area: " + shape.getArea() + ", x: " + shape.getX() + ", y: " + shape.getY());
        }
    }
}
