import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ShapeOrderedPrinterTest {

    @Test
    public void testCircleArea() {
        Shape circle = ShapeFactory.createShape("circle", 2.0, 0, 0);
        assertEquals(Math.PI * 2 * 2, circle.getArea(), 0.001);
    }

    @Test
    public void testSquareArea() {
        Shape square = ShapeFactory.createShape("square", 3.0, 0, 0);
        assertEquals( 9.0, square.getArea(), 0.001);
    }

    @Test
    public void testRectangleArea() {
        Shape rectangle = ShapeFactory.createShape("rectangle", 4.0, 5.0, 0, 0);
        assertEquals( 4.0 * 5.0, rectangle.getArea(), 0.001);
    }

    @Test
    public void testMultipleShapesOrderedByArea() {
        Shape circle = ShapeFactory.createShape("circle", 1.0, 0, 0);
        Shape square = ShapeFactory.createShape("square", 2.0, 0, 0);
        Shape rectangle = ShapeFactory.createShape("rectangle", 1.0, 5.0, 0, 0);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(circle);

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapes);
    }

    @Test
    public void testShapeWithZeroArea() {
        Shape circle = ShapeFactory.createShape("circle", 0.0, 1, 1);
        Shape square = ShapeFactory.createShape("square", 0.0, 0, 0);

        assertEquals( 0.0, circle.getArea(), 0.001);
        assertEquals( 0.0, square.getArea(), 0.001);
    }

    @Test
    public void testLargeShapesArea() {
        Shape circle = ShapeFactory.createShape("circle", 1000.0, 1, 1);
        Shape rectangle = ShapeFactory.createShape("rectangle", 500.0, 200.0, 0, 0);

        assertEquals( Math.PI * 1000 * 1000, circle.getArea(), 0.001);
        assertEquals( 500.0 * 200.0, rectangle.getArea(), 0.001);
    }


    @Test
    public void testEmptyList() {
        List<Shape> shapes = new ArrayList<>();

        OrderPrinter printer = new OrderPrinter();
        printer.printShapesInOrder(shapes);
    }

    @Test
    public void testCircleGetXGetY() {
        Shape circle = ShapeFactory.createShape("circle", 2.0, 10, 20);
        assertEquals("Circle x-coordinate should be 10", 10, circle.getX());
        assertEquals("Circle y-coordinate should be 20", 20, circle.getY());
    }


    @Test
    public void testSquareGetXGetY() {
        Shape square = ShapeFactory.createShape("square", 3.0, 15, 25);
        assertEquals("Square x-coordinate should be 15", 15, square.getX());
        assertEquals("Square y-coordinate should be 25", 25, square.getY());
    }


    @Test
    public void testRectangleGetXGetY() {
        Shape rectangle = ShapeFactory.createShape("rectangle", 4.0, 5.0, 30, 40);
        assertEquals("Rectangle x-coordinate should be 30", 30, rectangle.getX());
        assertEquals("Rectangle y-coordinate should be 40", 40, rectangle.getY());
    }
}