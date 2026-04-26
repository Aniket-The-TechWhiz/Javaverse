import java.util.Scanner;

class AddTwoNumberAndReturnSum{
  //function to add two number and return sum
  public static int sum(int a,int b){
    return a+b;
  }
  
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int a=sc.nextInt();
    System.out.print("Enter number 2: ");
    int b=sc.nextInt();
    System.out.println("("+a+"+"+b+") ="+sum(a,b));
  }
}
