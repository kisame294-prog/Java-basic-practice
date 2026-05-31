package Ex7_HowtoStaticMethod;

import java.util.Arrays;
import java.util.Random;

public class MkArray {
    public static int[] mkIntArray(int len, int low, int high){
        Random rand = new Random();
        int[]mk = new int[len];
        for (int i = 0; i < len; i++) {
            mk[i] = rand.nextInt(low,high + 1);
        }
        return mk;
    }
    public static void main(String[] args) {
        System.out.println(
                //Arrays.toStringを付けないと配列の「アドレス情報」が表示される
                //配列の中身を表示したいのでこれを使う
                Arrays.toString(mkIntArray(17,0,100)));
    }
}
