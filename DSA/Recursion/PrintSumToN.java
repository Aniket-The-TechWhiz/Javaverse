class PrintSumToN {

    public static void printSumToN(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println("sum = " + sum);
            return;
        }

        sum += i;

        printSumToN(i + 1, n, sum);
    }

    public static void main(String args[]) {

        printSumToN(1, 5, 0);

    }
}
