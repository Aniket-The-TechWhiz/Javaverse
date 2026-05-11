public class NQueens {

    final int N = 4;

    boolean isSafe(int board[][], int row, int col) {

        // Check left row
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Lower diagonal
        for (int i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean solveNQUtil(int board[][], int col) {

        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {

                board[i][col] = 1;

                if (solveNQUtil(board, col + 1))
                    return true;

                // Backtracking
                board[i][col] = 0;
            }
        }

        return false;
    }

    void solveNQ() {

        int board[][] = new int[N][N];

        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return;
        }

        printSolution(board);
    }

    void printSolution(int board[][]) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        NQueens q = new NQueens();

        q.solveNQ();
    }
}