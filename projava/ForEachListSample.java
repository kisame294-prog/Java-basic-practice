package projava;

import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        var names=List.of("yusuke","kis","sugiyama");
        for(var n:names){
            if (n.length() >= 5) {
                System.out.println(n);
            }
        }
    }
}
