class SelectionSort {

    public static void main(String args[]) {

        int arr[] = new int[]{1,2,3,4,5};

        for(int i = 0; i < arr.length - 1; i++) {

            int small = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            if(small != i) {
                int temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
