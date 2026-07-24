class A_ReverseArray{

  public static int [] reverseArray(int arr[]){
    int j=arr.length-1;
    int i=0;
    while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
    return arr;
  }
  public static void main (String args[]){
    int arr[]={11,2,32,4};
    int newArr[]=reverseArray(arr);
    for (int element: arr){
      System.out.print(element+" ");
    }
  }
}


