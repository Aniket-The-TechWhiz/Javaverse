public class C_StringLength{
  
  public static void countStringLength(String str){
      int count =0;
      for (char c:str.toCharArray()){
        count++;
      }
      System.out.println("Length = " + count);
  }
  public static void main (String args[]){
    countStringLength("Aniket");
  }
}
