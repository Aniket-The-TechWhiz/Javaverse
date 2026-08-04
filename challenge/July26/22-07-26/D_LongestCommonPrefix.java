public class D_LongestCommonPrefix {
    
    public static String longestCommonPrefix(String str[]) {
        // Handle empty or null array edge cases
        if (str == null || str.length == 0) {
            return "";
        }
        
        // Initialize prefix with the first string
        String prefix = str[0];
        
        // Compare prefix with every other string in the array
        for (int i = 1; i < str.length; i++) {
            // Trim the prefix until it matches the start of str[i]
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String args[]) {
        // Test Case 1: Standard match
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Prefix: " + longestCommonPrefix(test1)); // Output: "fl"

        // Test Case 2: No common prefix
        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Prefix: " + longestCommonPrefix(test2)); // Output: ""
    }
}
