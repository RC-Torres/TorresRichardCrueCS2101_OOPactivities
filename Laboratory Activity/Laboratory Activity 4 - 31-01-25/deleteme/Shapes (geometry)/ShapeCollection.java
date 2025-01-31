package geometry;

import java.text.DecimalFormat;

public class ShapeCollection {
    private Shape[] shapes;

    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void getPropertyValues() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (Shape shape : shapes) {
            shape.printShapeType();
            System.out.println("Area: " + df.format(shape.getArea()));
            System.out.println("Perimeter: " + df.format(shape.getPerimeter()) + "\n");
        }
    }
}
