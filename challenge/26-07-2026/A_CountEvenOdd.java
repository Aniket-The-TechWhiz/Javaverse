class A_CountEvenOdd{
  public static int[] getCountOfEvenOdd(int arr[]){
    if(arr==null || arr.length==0){return new int[]{0,0};};
    int even=0,odd=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0 && arr[i]%2==0){
        even++;
      }else if(arr[i]!=0 && arr[i]%2!=0){
        odd++;
      }
    }
    return new int[]{even,odd};
  }
  public static void main (String args[]){
    int arr[]={1,2,3,0};
    int newArr[]=getCountOfEvenOdd(arr);
    System.out.println("Count of Even element : "+newArr[0]);
    System.out.println("Count of odd element : "+newArr[1]);
  }
}
