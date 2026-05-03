class InsertionSort {

    public static void main(String args[]) {

        int arr[] = new int[]{2,4,6,1,5};

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = i + 1; j > 0; j--) {

                if(arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
