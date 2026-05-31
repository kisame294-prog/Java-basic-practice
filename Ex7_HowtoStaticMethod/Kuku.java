package Ex7_HowtoStaticMethod;

public class Kuku {
    //メソッドを宣言することによって、役割分担してコードの役割を分かりやすくしている
    public static String kuku1(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            sb.append(String.format("%3d", num * i));
        }
        return sb.toString(); //返り値として型がStringではないとダメなので、StringBuilderから変更
    }
    static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(kuku1(i));
        }
    }
}
