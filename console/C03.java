package console;

import java.util.Scanner;

public class C03 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数1:");
        int n = in.nextInt();
        System.out.print("整数2:");
        int m = in.nextInt();
        System.out.printf("%d+%d=%d",n,m,n+m);
    }
}
