import java.util.ArrayList;
public class Arraylistclass {
    public static void main (String args[])
    {
        ArrayList<String> arr=new ArrayList<String> ();
        arr.add("Aniket");
        arr.add("Sandesh");
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println(arr);
        arr.set(0,"Sandas");
        System.out.println(arr);
    }
}
