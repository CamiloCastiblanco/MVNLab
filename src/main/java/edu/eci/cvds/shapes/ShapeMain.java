package edu.eci.cvds.shapes;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        String[] shapes = new String[1];
        Scanner myObj = new Scanner(System.in);
        if (args == null || args.length != 1) {
            String shapeType = myObj.nextLine();
            shapes[0] = shapeType;
        }

        try {

            RegularShapeType type = RegularShapeType.valueOf(shapes[0]);
            Shape shape = ShapeFactory.create(type);
            System.out.println(String.format("Successfully created a %s with %s sides.", type,
                    shape.getNumberOfEdges()));
        } catch (IllegalArgumentException ex) {
            System.err.println("Parameter '" + shapes[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
