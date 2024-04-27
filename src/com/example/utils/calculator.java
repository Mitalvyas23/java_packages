package com.example.utils;

import com.example.geometry.circle;
import com.example.geometry.rectangle;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to get area of circle....");
        System.out.print("Enter a radius : ");
        float radius = input.nextInt();
        circle circle = new circle(radius);
        double area = circle.getRadius();
        System.out.printf("The circle area is : %f",area);

        System.out.println("\nWelcome to get area of rectangle....");
        System.out.print("Enter a length : ");
        float length = input.nextInt();
        System.out.print("Enter a width : ");
        float width = input.nextInt();
        rectangle rectangle = new rectangle(length,width);
        double area_rectangle = rectangle.get_area();
        System.out.printf("The rectangle area is : %f",area_rectangle);
    }
}
