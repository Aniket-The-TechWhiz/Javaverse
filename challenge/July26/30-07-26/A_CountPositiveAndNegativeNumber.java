public class A_CountPositiveAndNegativeNumber {
    public static int[] getCountPositiveAndNegativeNumber(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > 0) {
                positive++;
            } else if (ele < 0) {
                negative++;
            }
        }
        return new int[]{positive, negative};
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 3, -4, 5, 0};
        int newArr[] = getCountPositiveAndNegativeNumber(arr);
        System.out.println("Count of positive numbers: " + newArr[0]);
        System.out.println("Count of negative numbers: " + newArr[1]);
    }
}

