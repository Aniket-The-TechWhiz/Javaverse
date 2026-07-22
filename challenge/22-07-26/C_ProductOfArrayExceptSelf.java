class C_ProductOfArrayExceptSelf{
  //my logic overthinking 
  /*public static int [] productOfArrayExceptSelf(int arr[]){
  if(arr==null || arr.length==0 || arr.length<=2){
    throw new IllegalArgumentException("Cannot product this array array must contains more than 2 elements");
  }
  int newArr[]=new int[arr.length];
  for(int i=0;i<arr.length;i++){
    int j=0;
    newArr[i]=1;
    //condition for the last element
    if(i==arr.length-1){
      j=0;
    }else{
      j=i+1;
    }
    //loop to except the self and product all other elements
    while(j!=i){
      newArr[i]=newArr[i]*arr[j];
      if(j==arr.length-1){
        j=0;
      }else{
        j++;
      }
    }
  }
    return newArr;
  }*/
 
  public static int [] productOfArrayExceptSelf(int arr[]){
    if(arr==null || arr.length==0 || arr.length<=2){
      throw new IllegalArgumentException("Cannot product this array array must contains more than 2 elements");
    }
    int newArr[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
      newArr[i]=1;
      for(int j=0;j<arr.length;j++){
        if(j!=i){
          newArr[i]*=arr[j];
        }
      }
    }
    return newArr;
  }
  
  
  public static void main(String args[]){
    int arr[]={1,2,3,4};
    int newArr[]=productOfArrayExceptSelf(arr);
    for(int element: newArr){
      System.out.print(element+" ");
    }
  }
}
