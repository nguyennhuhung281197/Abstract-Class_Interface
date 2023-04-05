package Resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.resize(50);
        System.out.println(rectangle);

        Circle circle = new Circle(4);
        circle.resize(50);
        System.out.println(circle);

        Square square = new Square(2);
        square.resize(20);
        System.out.println(square);

    }
}
