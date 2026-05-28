package console;

import java.util.Scanner;

public class C06 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数:");
        int n = in.nextInt();
        if(n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
