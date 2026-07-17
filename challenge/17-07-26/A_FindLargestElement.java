public class A_FindLargestElement {
  public static int largeElement(int[] nums){
    if(nums==null){
      return 0;
    }
    int max=0;
    int i=0;
    while(i<nums.length){
      if(nums[i]>max){
        max=nums[i];
      }
      i++;
    }
    return max;
  }
    public static void main (String args[]){
    int nums[]={1,2,3,4,5,6};
    int max=largeElement(nums);
    System.out.println(max!=0 ? "Max element : "+max : "Array is null or full of less than or equals to 0's");
    }
}
