class A_ConvertUpperToLowerCase{
  public static String getConvertedUpperToLowerCase(String str){
    if(str==null){throw new IllegalArgumentException("String must not null");}
    char arr[]=str.toCharArray();
    for(int i=0;i<arr.length;i++){
      char ch=arr[i];
      if(ch>='A' && ch<='Z'){
        arr[i]=(char)(ch+32);
      }
    }
    return new String(arr);
  }
  public static void main (String args[]){
    String str=getConvertedUpperToLowerCase("ANIKEt");
    System.out.println(str);
  }
}
