package projava;

import java.util.ArrayList;
import java.util.List;

public class StreamSample3 {
    public static void main(String[] args) {
        var fruits = List.of("apple","banana","grape");
        var a = new ArrayList<String>();
        var result = false ;
        for (var f :fruits){
            if(f.length() == 5 && f.contains("p")) {
                result = true ;
                break;
            }
        }
        System.out.println(result);
    }
}
