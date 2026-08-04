import java.util.Arrays;
public class D_Anagram{
  public static boolean checkStringAnagram(String s1,String s2){
    if(s1.length()!=s2.length()){return false;}
    char arr1[]=s1.toCharArray();
    char arr2[]=s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
  }
  public static void main (String args[]){
    String s1="listen";
    String s2="silent";
    System.out.println(checkStringAnagram(s1,s2)==true ? "Yes anagram" : "Not anagram");
  }
}
