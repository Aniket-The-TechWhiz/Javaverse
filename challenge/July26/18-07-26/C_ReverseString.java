class C_ReverseString{
  public static void main(String args[]){
    String str="aniket h";
    char arr[]=str.toCharArray();
    int first=0;
    int last=arr.length-1;
    
    while(first<last){
      char temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;

      first++;
      last--;
    }
    String rev = new String(arr);

    System.out.println(rev);
  }
}
