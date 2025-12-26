package practice;
import java.util.HashSet;

public class Hashsetclass{
  public static void main(String args[])
  {
    HashSet <Integer> hs= new HashSet<Integer>();
    hs.add(1);
    hs.add(2);
    hs.add(3);
    hs.add(1);
    System.out.println(hs);
  }
}
