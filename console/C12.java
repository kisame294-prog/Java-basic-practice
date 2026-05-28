package console;

import java.util.Scanner;

public class C12 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("個数n: ");
        int n = in.nextInt();
        System.out.println("＊".repeat(n));
    }
}
