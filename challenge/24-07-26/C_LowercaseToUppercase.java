class C_LowercaseToUppercase{
  //for this we need to subtract the assci val with 32 will get upper case 'A' is 65 and 'a' is 97 then 97-32 = 65
  public static String getLowercaseToUppercase(String str){
    if(str==null || str.length()==0){throw new IllegalArgumentException("String must not be null!");}
    str=str.toLowerCase();
    char ch[]=str.toCharArray();
    for (int i=0;i<ch.length;i++){
      if(ch[i]>='a' && ch[i]<='z'){
        ch[i]=(char)(ch[i]-32);
      }
    }
    return new String(ch);
  }
  public static void main (String args[]){
    String str="abc";
    System.out.println(getLowercaseToUppercase(str));
  }
}
