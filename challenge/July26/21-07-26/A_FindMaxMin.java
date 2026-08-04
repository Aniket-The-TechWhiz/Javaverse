public class A_FindMaxMin {
    public static int[] findMaxMin(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) { 
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }

    public static void main(String args[]) {
        int arr[] = {5, 3, 9, 1};
        try {
            int[] results = findMaxMin(arr); 
            System.out.println("Max value :" + results[0] + ", Min value :" + results[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

