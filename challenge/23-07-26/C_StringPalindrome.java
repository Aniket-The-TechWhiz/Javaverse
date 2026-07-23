class C_StringPalindrome{
  public static boolean isStringPalindrome(String str){
    if(str==null){ throw new IllegalArgumentException("String must me not null");}
    String newStr="";
    for(int i=str.length()-1;i>=0;i--){
      newStr+=str.charAt(i);
    }
    if(str.equals(newStr)){
      return true;
    }
    return false;
  }
  public static void main (String args[]){
    String str="oyo";
    try{
      System.out.println(isStringPalindrome(str) ? "String is Palindrome" : "String is not Palindrome");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
