package com.exerciseEightPointFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RectangleClassExceptions {
        RectangleClass rectangleClass = new RectangleClass();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for length of rectangle: ");
        double length = input.nextDouble();
        rectangleClass.setLengthOfRectangle(length);

        System.out.println("Enter a value for width of rectangle: ");
        double width = input.nextDouble();
        rectangleClass.setWidthOfRectangle(width);

        rectangleClass.areaOfRectangle();
        StringBuilder stringBuilder = new StringBuilder("The area of the rectangle is ");
        System.out.println( stringBuilder.append(rectangleClass.getAreaOfRectangle()).toString());

        rectangleClass.perimeterOfRectangle();
        StringBuilder stringBuilder1 = new StringBuilder("The perimeter of the rectangle is ");
        System.out.println(stringBuilder1.append(rectangleClass.getPerimeterOfRectangle()).toString());


    }
}
