package javaBasic._03._01;

public class Rectangle {
    int width;
    int height;

    boolean isSquare() {

        return width == height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    int calculateArea() {
        return width * height;
    }
}
