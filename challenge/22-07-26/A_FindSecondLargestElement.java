public class A_FindSecondLargestElement { 
    public static int findSecondLargestElement(int arr[]) {
        if (arr == null || arr.length == 0) { 
            throw new IllegalArgumentException("Argument is incorrect!"); 
        } 
        if (arr.length == 1) { 
            throw new IllegalArgumentException("Array must be more than 1 element!"); 
        } 
        
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE; 
        
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > max) { 
                secondMax = max; 
                max = arr[i]; 
            } else if (arr[i] > secondMax && arr[i] != max) { 
                secondMax = arr[i]; 
            } 
        } 
        
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found (all elements might be equal).");
        }
        
        return secondMax; 
    } 

    public static void main (String args[]) { 
        int arr[] = {1, 1}; 
        
        try {
            System.out.println("Second Max number: " + findSecondLargestElement(arr)); 
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    } 
}

