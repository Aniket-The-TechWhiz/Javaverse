import java.util.*;
public class M1{

  //methods
  public static String sayHello(String username){
    return "Hello user : "+username;
  }

  public static void main (String args[]){
    Scanner sb= new Scanner(System.in);
    System.out.print("Enter user Name:");
    String name=sb.next();
    System.out.println(sayHello(name));
  }
}
