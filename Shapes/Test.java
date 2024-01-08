package Shapes;

import java.util.ArrayList;
import java.util.List;

class Test {

    static void testShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(); 
        }
    }

    public class Main {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());


        Test.testShapes(rectangles);
        Test.testShapes(circles);
    }
}}