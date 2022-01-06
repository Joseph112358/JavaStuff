import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsWithMethods {
    public static void main(String [] args){
    List<Integer> OriginalList = List.of(1,2,3,4,5);
    System.out.println(reverse(OriginalList));
    System.out.println(OriginalList);

    List<String> StringList = List.of("Joe","Jim","Jeff");
        System.out.println(reverse(StringList));
        System.out.println(StringList);
    }

    private static <T> List<T> reverse(List<T> OriginalList){
        List<T> reversedList = new ArrayList<>(OriginalList);
        Collections.reverse(reversedList);
        return reversedList;
    }
}


