package console;

import java.util.Scanner;

public class C07 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("点数: ");
        int score = in.nextInt();
        if(score < 0 || score > 100){
            System.out.println("範囲外");
        }else if(score >= 80){
            System.out.println("A判定");
        }else if(score >= 60){
            System.out.println("B判定");
        }else {
            System.out.println("C判定");
        }
    }
}
