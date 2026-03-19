
import java.util.Scanner;
public class Arrayindexoutbound{
    public static void main (String args[])
    {
        int arr[]={1,2,3,4,5};
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the index to access array element:");
            int index=sc.nextInt();
            System.out.println("Element at index "+index+" is: "+arr[index]);
            sc.close();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound exception occurred."+e.getMessage());
        }
    }
}