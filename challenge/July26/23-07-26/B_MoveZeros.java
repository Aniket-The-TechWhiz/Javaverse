class B_MoveZeros{
  public static int [] moveAllZeros(int []arr){
    if (arr == null) {
        throw new IllegalArgumentException("Array cannot be null");
    }
    for (int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        continue;
      }else{
        for(int j=i+1;j<arr.length;j++){
          if(arr[j]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            break;
          }
        }
      }
    }
    return arr;
  }
  public static void main(String args[]){
    int arr[]={1,2,3,5,0,0,0};
    int newArr[]=moveAllZeros(arr);
    for(int element:newArr){
      System.out.print(element+" ");
    }
  }
}
