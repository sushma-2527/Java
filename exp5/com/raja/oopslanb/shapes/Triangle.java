package com.raja.oopslanb.shapes;
import java.util.Scanner;
public class Triangle implements Shape {
private double length;
private double height;
double area = 0.0;
@Override
public void printArea() {
System.out.println("\nTriangle");
System.out.println("---------\n");
Scanner input = new Scanner(System.in);
System.out.println("Enter Length of Triangle : ");
this.length = input.nextDouble();
System.out.println("Enter Hight of Triangle : ");
this.height = input.nextDouble();
this.area = 0.5 * this.length * this.height;
System.out.println("Area of the Triangle is : " + this.area);
}

}