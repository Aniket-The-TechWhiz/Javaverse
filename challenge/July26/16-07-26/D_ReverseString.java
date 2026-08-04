public class D_ReverseString {
    public static String reverseString(String s){
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
    public static void main (String args[]){
        System.out.println(reverseString("Aniket"));
    }
}
