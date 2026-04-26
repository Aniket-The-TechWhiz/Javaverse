import java.util.Scanner;
public class PrintSumOfAllOddNumbers {

    public static int sum(int n){
        if (n==0 || n<1){
            return 0;
        }
        int sum=0;
        for (int i=1;i<=n;i+=2){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n =sc.nextInt();
        sc.close();
        System.out.println(sum(n) == 0 ? "Invalid number" : sum(n));
    }
}
