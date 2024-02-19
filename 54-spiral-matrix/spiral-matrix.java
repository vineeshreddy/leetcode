class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        final int row = matrix.length;
        final int column = matrix[0].length;
        int right = column - 1;
        int down = row - 1;
        int left = 0;
        int up = 0;

        while (res.size() < row * column) {
            /* Traverse from left boundary to right boundary.*/
            for (int col = left; col <= right; col++) {
                res.add(matrix[up][col]);
            }

            /* Traverse from up to down boundary*/
            for (int r=up+1; r<=down; r++) {
                res.add(matrix[r][right]);
            }

            /* Make sure we are not at the same row we traversed already.*/
            if (up != down) {
                /* Traverse from right to left.*/
                for (int l=right-1; l>=left; l--) {
                    res.add(matrix[down][l]);
                }
            }

            /* Make sure we are on a different column.*/
            if (left != right) {
                /* Traverse upwards.*/
                for (int c=down-1; c>up; c--) {
                    res.add(matrix[c][left]);
                }
            }

            left++;
            right--;
            down--;
            up++;
        }
        return res;
    }
}