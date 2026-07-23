import java.util.HashMap;

class D_IsomorphicString {
    public static boolean isIsomorphicString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            char first = s1.charAt(i);
            char second = s2.charAt(i);
            
            if (map.containsKey(first)) {
                if (map.get(first) != second) {
                    return false;
                }
            } 
            else {
                if (map.containsValue(second)) {
                    return false;
                }
                
                map.put(first, second);
            }
        }
        return true; 
    }

    public static void main(String args[]) {
        System.out.println(isIsomorphicString("egg", "add")); // Output: true
        System.out.println(isIsomorphicString("foo", "bar")); // Output: false
        System.out.println(isIsomorphicString("aaa", "aaa")); // Output: true
    }
}

