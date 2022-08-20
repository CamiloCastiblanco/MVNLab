package edu.eci.cvds.shapes;

import edu.eci.cvds.shapes.Concrete.Quadrilateral;
import edu.eci.cvds.shapes.Concrete.Triangle;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        case Triangle:
            return new Triangle();
        case Quadrilateral:
            return new Quadrilateral();
    }
}
