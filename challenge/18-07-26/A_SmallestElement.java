  class A_SmallestElement{
  public static int smallestElement(int []arr){
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }

    int small = arr[0];
    for (int element:arr){
      if(element<small){
        small=element;
      }
    }
    return small;
  }
  public static void main (String args[]){
    int arr[]={1,2,3,5};
    System.out.println(smallestElement(arr));
  }
}
