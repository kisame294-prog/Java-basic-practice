package console;

import java.util.Scanner;

public class C14 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("文字列: ");
        String s = in.nextLine();
        System.out.println(s.replaceAll("(?<=.).(?=.)","＊"));
    }
}
