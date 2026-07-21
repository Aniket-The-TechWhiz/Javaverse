public class C_CountVowelsAndConsonants {

  public static int[] countVowelsAndConsonants(String str) {
    if (str == null) {
      return new int[]{0, 0};
    }

    int vowels = 0;
    int consonants = 0;
    
    String lowerStr = str.toLowerCase();

    for (int i = 0; i < lowerStr.length(); i++) {
      char ch = lowerStr.charAt(i);
      
      if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }
    }
    return new int[]{vowels, consonants};
  }

  public static void main(String args[]) {
    String input = "Hello, World! 2026";
    
    int[] counts = countVowelsAndConsonants(input);
    
    System.out.println("Input text: \"" + input + "\"");
    System.out.println("Vowels count: " + counts[0]);
    System.out.println("Consonants count: " + counts[1]);
  }
}

