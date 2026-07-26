class B_MergeTwoSortedArray{
  public static int[] getMergeTwoSortedArray(int arr1[],int arr2[]){
    int n=arr1.length+arr2.length;
    int newArr[]=new int[n];
    int k=0;
    for(int i=0;i<arr1.length;i++){
      newArr[k]=arr1[i];
      k++;
    }
    for(int j=0;j<arr2.length;j++){
      newArr[k]=arr2[j];
      k++;
    }
    for(int l=0;l<n;l++){
      for(int m=l+1;m<n;m++){
        if(newArr[l]>newArr[m]){
          int temp=newArr[l];
          newArr[l]=newArr[m];
          newArr[m]=temp;
        }
      }
    }
    return newArr;
  }
  public static void main(String args[]){
    int arr1[]={1,3,5};
    int arr2[]={2,4,6};
    int newArr[]=getMergeTwoSortedArray(arr1,arr2);
    for(int ele:newArr){
      System.out.print(ele+" ");
    }
  }
}

/*class B_MergeTwoSortedArray {
  public static int[] getMergeTwoSortedArray(int arr1[], int arr2[]) {
    int n1 = arr1.length;
    int n2 = arr2.length;
    int newArr[] = new int[n1 + n2];
    
    int i = 0; // Pointer for arr1
    int j = 0; // Pointer for arr2
    int k = 0; // Pointer for newArr

    // Step 1: Compare elements from both arrays and copy the smaller one
    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        newArr[k] = arr1[i];
        i++;
      } else {
        newArr[k] = arr2[j];
        j++;
      }
      k++;
    }

    // Step 2: If any elements are left over in arr1, copy them
    while (i < n1) {
      newArr[k] = arr1[i];
      i++;
      k++;
    }

    // Step 3: If any elements are left over in arr2, copy them
    while (j < n2) {
      newArr[k] = arr2[j];
      j++;
      k++;
    }

    return newArr;
  }

  public static void main(String args[]) {
    int arr1[] = {1, 3, 5};
    int arr2[] = {2, 4, 6};
    int newArr[] = getMergeTwoSortedArray(arr1, arr2);
    for (int ele : newArr) {
      System.out.print(ele + " ");
    }
  }
}
*/
