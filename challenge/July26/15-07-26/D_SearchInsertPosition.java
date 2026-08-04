public class D_SearchInsertPosition {
   public int searchInsertPosition(int[] nums, int val) {
    //O(n)
    for (int i = 0; i < nums.length; i++) {
        
        if (val <= nums[i]) {
            return i;
        }
    }
   
    return nums.length;
    }

    //for O(log n)
    // public int searchInsert(int[] nums, int target) {
    //     int low = 0;
    //     int high = nums.length - 1;
        
    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;
            
    //         if (nums[mid] == target) {
    //             return mid;
    //         } else if (nums[mid] < target) {
    //             low = mid + 1; 
    //         } else {
    //             high = mid - 1; 
    //         }
    //     }       
       
    //     return low;
    // }
    public static void main (String args[]){
        int arr[]={1,3,6};
        D_SearchInsertPosition obj=new D_SearchInsertPosition();
        System.out.println(obj.searchInsertPosition(arr,7));
    }
}
