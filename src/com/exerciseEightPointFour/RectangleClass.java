package com.exerciseEightPointFour;
//8.4 (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
//        defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set
//        and get
//        methods for both length and width. The set methods should verify that length and width are each
//        floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

public class RectangleClass {

    private double width;
    private double length;
    private double area;

    public void setLengthOfRectangle(double length) {
        if (length > 0.0 && length < 20.0){
            this.length = length;
        }
    }

    public double getLengthOfRectangle() {
        return length;
    }

    public void setWidthOfRectangle(double width) {
        if (width > 0.0 && width < 20.0){
            this.width = width;
        }
    }

    public double getWidthOfRectangle() {
        return width;
    }

    public void areaOfRectangle() {
        area = length * width;
    }

    public double getAreaOfRectangle() {
        return area;
    }
}
