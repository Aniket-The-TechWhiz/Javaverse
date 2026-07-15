import java.util.HashSet;
import java.util.Set;

public class B_TargetValue {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, -1};
        int target = 6;

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    int first = Math.min(arr[i], arr[j]);
                    int second = Math.max(arr[i], arr[j]);

                    String pair = "["+first + "," + second+"]";
                    if (!uniquePairs.contains(pair)){
                        uniquePairs.add(pair);
                    }
                    
                }
            }
        }
        System.out.println(uniquePairs);
    }
}