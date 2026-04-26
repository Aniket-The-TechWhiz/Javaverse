import java.util.Scanner;

class Factorial{

  //fact method
  public static int fact(int n) {
    //recursive fuction 
    // if (n == 0 || n == 1) {
    //     return 1;
    // } else {
    //     return n * fact(n - 1);
    // }
    int fact=1;
    for (int i=n;i>1;i--){
        fact =fact*i;        
    }
    return fact;
}
  
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=sc.nextInt();
    sc.close();
    if(n<0) {
    System.out.println("negative number are not accepted");
    return;
    }
    System.out.println(fact(n));
  }
}
