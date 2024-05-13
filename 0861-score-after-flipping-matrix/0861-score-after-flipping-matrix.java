class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Ensure leftmost bit of each row is 1
        for (int[] row : grid) {
            if (row[0] == 0) {
                // Toggle the entire row if leftmost bit is 0
                toggleRow(row);
            }
        }

        // For each column, if there are fewer 1s than 0s, toggle the column
        for (int j = 1; j < cols; j++) {
            int countOnes = 0;
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes < (rows + 1) / 2) {
                toggleColumn(grid, j);
            }
        }

        // Calculate the final score
        int score = 0;
        for (int i = 0; i < rows; i++) {
            score += binaryToDecimal(grid[i]);
        }
        return score;
    }

    private void toggleRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = 1 - row[i];
        }
    }

    private void toggleColumn(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][col] = 1 - grid[i][col];
        }
    }

    private int binaryToDecimal(int[] binary) {
        int decimal = 0;
        for (int i = binary.length - 1, power = 0; i >= 0; i--, power++) {
            decimal += binary[i] * Math.pow(2, power);
        }
        return decimal;
    }
}