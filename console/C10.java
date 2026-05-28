package console;

import java.util.Random;
import java.util.Scanner;

public class C10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("整数n: ");
        int n = in.nextInt();
        for (int i = 1; i <= 6; i++) {
            int m = rand.nextInt(10,100);
            System.out.println(m);
        }
    }
}
