import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Arraylistclass {
    public static void main (String args[])
    {
        // ArrayList<String> arr=new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
        
        // Collections.sort(arr);
        // System.out.println(arr);

        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
        
        List<String> sortedList = arr.stream()
                                .sorted()
                                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
