class B_RemoveElement {
    int expected[];
    
    public int removeElement(int[] nums, int val) {        
        expected = nums; 
        int k = 0;      
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                expected[k] = nums[i]; 
                k++;                   
            }
        }
        
        return k;
    }
    
    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
        B_RemoveElement obj = new B_RemoveElement();
        int k = obj.removeElement(arr, 2);
        
        System.out.println("k = " + k);
        
        for (int i = 0; i < k; i++) {
            System.out.println(obj.expected[i]);
        }
    }
}