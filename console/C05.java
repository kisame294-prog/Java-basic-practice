package console;

import java.util.Scanner;

public class C05 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数:");
        int n = in.nextInt();
        System.out.println(n%10);
    }
}
