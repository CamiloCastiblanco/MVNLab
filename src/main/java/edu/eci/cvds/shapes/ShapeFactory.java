package edu.eci.cvds.shapes;


import edu.eci.cvds.shapes.Concrete.Hexagon;
import edu.eci.cvds.shapes.Concrete.Pentagon;
import edu.eci.cvds.shapes.Concrete.Quadrilateral;
import edu.eci.cvds.shapes.Concrete.Triangle;

public class ShapeFactory {
    static Shape s;

    public static Shape create(RegularShapeType type) {
        switch(type) {
            case TRIANGLE:
                s = new Triangle();
                break;
            case QUADRILATERAL:
                s = new Quadrilateral();
                break;
            case PENTAGON:
                s = new Pentagon();
                break;
            case HEXAGON:
                s = new Hexagon();
                break;
        }
        return s;
    }
}
