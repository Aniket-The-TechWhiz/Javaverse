import java.util.Scanner;

class Factorial{

  //fact method
  public static int fact(int n) {
   
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }
}
  
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=sc.nextInt();
    if(n<0) {
    System.out.println("negative number are not accepted");
    return;
    }
    System.out.println(fact(n));
  }
}
