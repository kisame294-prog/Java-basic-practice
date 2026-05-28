package console;

import java.util.Scanner;

public class C19 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数n(0~255): ");
        int n = in.nextInt();
        System.out.println(n << 2);
    }
}
