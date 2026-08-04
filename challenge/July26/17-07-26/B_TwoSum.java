import java.util.Set;
import java.util.HashSet;

public class B_TwoSum {
  
  public static void twoSum(int nums[], int target) {
    if (nums == null || nums.length < 2) {
      System.out.println("Match not found for the target");
      return;
    }
    
    Set<String> s = new HashSet<>();
    boolean flag = false;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          int min = Math.min(nums[i], nums[j]);
          int max = Math.max(nums[i], nums[j]);
          String pair = min + "," + max;
          
          if (!s.contains(pair)) {
            s.add(pair);
            System.out.println("Pair found: [" + pair + "]");
          }
          flag = true;
        }
      }
    }
    
    if (flag == false) {
      System.out.println("Match not found for the target");
    }
  }

  public static void main(String args[]) {
    int n[] = {1, 2, 3, 4, 5, 1, 4};
    twoSum(n, 5);
  }
}

