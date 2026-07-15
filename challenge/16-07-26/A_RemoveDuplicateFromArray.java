import java.util.Arrays;
public class A_RemoveDuplicateFromArray {
    int rmd[];
    public void removeDuplicateFromArray(int nums[]){
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        rmd=new int[j+1];
        for(int i=0;i<rmd.length;i++){
            rmd[i]=nums[i];
        }
    }
    public static void main (String args[]){
        int arr[]={3,4,2,3,5,1,1,3,2,5,6};
        A_RemoveDuplicateFromArray obj=new A_RemoveDuplicateFromArray();
        obj.removeDuplicateFromArray(arr);
        for(int n:obj.rmd){
            System.out.print(n+" ");
        }
    }
}
