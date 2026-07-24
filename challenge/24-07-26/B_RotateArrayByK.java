class B_RotateArrayByK{
  public static int[] rotateArrayByK(int arr[],int k){
    for(int i=0;i<k;i++){
      int last=arr[arr.length-1];
      for(int j=arr.length-1;j>=1;j--){
        arr[j]=arr[j-1];
      }
      arr[0]=last;
    }
    return arr;
  }
  public static void main (String args[]){
    int arr[]={1,2,3,4};
    int newArr[]=rotateArrayByK(arr,2);
    for (int element: arr){
      System.out.print(element+" ");
    }
  }
}

  
