package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Your Rectangle 1 \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());

        System.out.println("=================================================================");

        System.out.println("Your Rectangle 2 \n"+ rectangle2.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle2.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle2.getArea());
    }
}
