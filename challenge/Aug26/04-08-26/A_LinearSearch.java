class A_LinearSearch{
  public static void main (String args[]){
    int arr[]={1,2,3,4,5};
    int searchEle=2;
    for (int i=0;i<arr.length;i++){
      if(searchEle==arr[i]){
        System.out.println("Element found at position : arr["+(i)+"] ="+arr[i]);
        break;
      }
    }
  }
}
