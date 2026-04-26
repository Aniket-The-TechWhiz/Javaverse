import java.util.Scanner;

public class PrintAverage {
    public static long average(long a,long b,long c){
        return ((a+b+c)/3);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        long a=sc.nextLong();
        System.out.print("Enter number 2: ");
        long b=sc.nextLong();
        System.out.print("Enter number 3: ");
        long c=sc.nextLong();
        sc.close();
        System.out.println("("+a+"+"+b+"+"+c+")/3 ="+average(a,b,c));

    }
}
