package console;

import java.util.Scanner;

public class C08 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(;;) {
            System.out.print("整数: ");
            int n = in.nextInt();
            sum += n;
            if(n == 0){
                System.out.println(sum);
                break;
            }
        }
    }
}
