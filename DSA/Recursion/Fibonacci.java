public class Fibonacci {
    public static void printFibonacciSerise(int n1,int n2,int n){
        int sum;
        sum=n1+n2;
        if(sum>n){
            return;
        }
        System.out.print(" "+sum);
        printFibonacciSerise(n2,sum,n);
    }

    public static void main (String args[]){
        int n1=0,n2=1;
        int n=8;
        System.out.print(n1+" "+n2);
        printFibonacciSerise(n1,n2,n);
    }
}
