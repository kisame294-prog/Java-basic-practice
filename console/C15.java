package console;

import java.util.Scanner;

public class C15 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("文字列: ");
        String s = in.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                result += "?";
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
