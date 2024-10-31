package org.example;
import java.util.Objects;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) throws Exception {
        if (width <= 0 || length <= 0)
            throw new Exception("Отрицательный размер отрезка");
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double perimeterRectangle() {
        return (width + length) * 2;
    }

    public double areaRectangle() {
        return (length * width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0
                ||  Double.compare(length, rectangle.width) == 0 && Double.compare(width, rectangle.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }
}