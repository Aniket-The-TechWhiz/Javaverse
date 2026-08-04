public class B_ContainsDuplicate{
  public static boolean containsDuplicate(int arr[]){
    if(arr==null || arr.length==0){
      throw new IllegalArgumentException("Array must contain at least one element.");
    }  
    if (arr.length <= 1) {
      return false; 
    }
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          return true;
        }
      }
    }
    return false;
  }
  public static void main (String args[]){
    int arr[]={1,2,1};
    try{
      System.out.println(containsDuplicate(arr) ? "Array contains duplicate" : "Array not contains duplicate");
    }catch(IllegalArgumentException e){
      System.out.println("Error: " + e.getMessage());
    }
  }
}
