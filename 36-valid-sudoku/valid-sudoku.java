class Solution {
    public boolean isValidSudoku(char[][] board) {
        // since all are unique values we will consider hashset
        HashSet<String> seen = new HashSet(); 
        // for rows
        for (int i=0; i<9; ++i) {
            // for columns
            for (int j=0; j<9; ++j) {
                //consider the current character
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}