package org.lesson3.ocp;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));
        double sumArea = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getCathetus1()
                        * triangle.getCathetus2() / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += pow(square.getSide(), 2);
            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                sumArea += Math.PI * pow(circle.getRadius(), 2);
            }
        }
        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);


        List<ShapeV2> shapesV2 = new ArrayList<>();
        shapesV2.add(new RightTriangleV2(2, 3));
        shapesV2.add(new SquareV2(4));
        shapesV2.add(new CircleV2(3));
        double sumAreaV2 = 0.0;
        for (ShapeV2 shape : shapesV2) {
            sumAreaV2 += shape.getArea();
        }
        System.out.printf("Сумма площадей фигур равна %f \n", sumAreaV2);
    }
}

