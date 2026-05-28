package console;

import java.util.Scanner;

public class C09 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数n: ");
        int n = in.nextInt();
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
