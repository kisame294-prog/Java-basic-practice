package console;

import java.util.Scanner;

public class C02 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("名前: ");
        String name = in.nextLine();
        System.out.println("こんにちは"+name+"さん");
    }
}
