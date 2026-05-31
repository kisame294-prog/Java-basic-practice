package Ex7_HowtoStaticMethod;

import java.util.Scanner;

public class Shape {
    public static double circleArea(double radius) {
        return radius * radius * Math.PI;
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("半径: ");
        double radius = in.nextDouble();

        System.out.printf("面積=%.3f", circleArea(radius));
    }
}
