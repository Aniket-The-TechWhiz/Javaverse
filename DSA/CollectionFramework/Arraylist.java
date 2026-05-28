import java.util.*;
public class Arraylist {
    public static void main (String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.addAll(Arrays.asList(2,3,4,5,6));
        arr.remove(0);
        arr.add(0,1);
        System.out.println("List :"+arr);
    }
}
