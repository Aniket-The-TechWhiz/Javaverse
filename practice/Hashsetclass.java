import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hashsetclass{
  public static void main(String args[])
  {
    HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 1));
    List<Integer> filteredList = hs.stream()
                               .filter(x -> x % 2 == 0)
                               .toList();

    System.out.println(filteredList);
  }
}
