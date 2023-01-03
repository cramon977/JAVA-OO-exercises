package application;
import entities.Rectangle;

import java.util.Scanner;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        out.println("Enter rectangle width and height:");
        rectangle.setRectangle(sc.nextDouble(), sc.nextDouble());
        out.println(rectangle);
    }
}
