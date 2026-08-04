// import java.util.Arrays;
// import java.util.HashSet;
public class C_RemoveDuplicatesfromSortedArray {
    int removedDuplicateArray[];
    public int removeDuplicate(int nums[]){
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        removedDuplicateArray=new int[j+1];
        for(int i=0;i<removedDuplicateArray.length;i++){
            removedDuplicateArray[i]=nums[i];
        }
        return j+1;
    }
   public static void main (String args[]){
    C_RemoveDuplicatesfromSortedArray obj=new C_RemoveDuplicatesfromSortedArray();
    int arr[]={0,0,1,1,1,2,2,3,3,4};
    obj.removeDuplicate(arr);
    for(int n:obj.removedDuplicateArray){
        System.out.print(n+" ");
    }
   } 

// public static void main (String args[]){
//     int arr[]={0,0,1,1,1,2,2,3,3,4};
//     HashSet<Integer> rmd = new HashSet<>();
//     for(int num:arr){
//         rmd.add(num);
//     }
//     System.out.println(rmd);
//     int[] uniqueArr = rmd.stream().mapToInt(Integer::intValue).toArray();
//     System.out.println("New Array: " + Arrays.toString(uniqueArr));
// }
}
