class A_CheckArraySorted{
  public static boolean isArraySorted(int[] arr) {
    if (arr == null) {
        throw new IllegalArgumentException("Array cannot be null");
    }

    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
            return false;
        }
    }

    return true;
}
  public static void main (String args[]){
    int arr[]={};
    try{
      System.out.println(isArraySorted(arr)? "Yes Sorted" : "Not Sorted");
      }catch(Exception e){
        System.out.println(e);
      }
  }
}
