import java.util.Arrays;
public class E_RemoveDuplicateFromArray {
    int rmd[];
    public int removeDuplicateFromArray(int nums[]){
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
        return j+1;
    }
    public static void main (String args[]){
        int arr[]={3,4,2,3,5,1,1,3,2,5,6};
        E_RemoveDuplicateFromArray obj=new E_RemoveDuplicateFromArray();
        obj.removeDuplicateFromArray(arr);
        for(int n:obj.rmd){
            System.out.print(n+" ");
        }
    }
}
