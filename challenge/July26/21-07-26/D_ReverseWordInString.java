class D_ReverseWordInString {

    public static String reverseWords(String str) {

        String words[] = str.split(" ");

        String ans = "";

        for (int i = words.length - 1; i >= 0; i--) {

            ans += words[i];

            if (i != 0) {
                ans += " ";
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        String str = "I love Java";

        System.out.println(reverseWords(str));
    }
}

/*
class D_ReverseWordInString {

    public static void reverseWords(String str) {

        int i = str.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            int end = i;

            // Find beginning of current word
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1;

            // Print current word
            for (int j = start; j <= end; j++) {
                System.out.print(str.charAt(j));
            }

            System.out.print(" ");
        }
    }

    public static void main(String args[]) {

        String str = "I love Java";

        reverseWords(str);
    }
}
*/
