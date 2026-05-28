package console;

import java.util.Scanner;

public class C04 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("半径");
        double r = in.nextDouble();
        System.out.println(r*r*3.14);
    }
}
