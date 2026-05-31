package projava;

public class ForSample {
    public static void main(String[] args) {
        for(int i = 0; i < 9; i ++){
            if(i >= 3 && i<=6) {
                System.out.println("skip");
                continue;
            }
            System.out.println(i);
        }
    }
}
