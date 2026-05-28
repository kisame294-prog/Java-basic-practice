package console;

import java.util.Random;
import java.util.Scanner;

public class C16 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("整数n: ");
        int n = in.nextInt();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    +"abcdefghijklmnopqrstuvwxyz"
                    +"1234567890";
        Random rand = new Random();
        String password = "";
        for(int i = 0;i <= n;i ++){
           int index = rand.nextInt(chars.length());
           password += chars.charAt(index);
        }
        System.out.println(password);
    }
}
