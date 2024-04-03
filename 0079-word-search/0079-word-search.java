class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int columns=board[0].length;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(word.charAt(0)==board[r][c]){
                    boolean found=dfs( board, word, r, c, 0);
                    if(found) return true;
                }
            }
        }
        return false; 
    }

    public boolean dfs(char[][] board, String word, int r, int c, int wi){
        //base case
        if(wi==word.length()) return true;
        //out of bound case
        int rows=board.length;
        int columns=board[0].length;
        if(r<0 || r>=rows || c<0 || c>=columns) return false;
        //invalid case
        if(board[r][c]==' ' || board[r][c]!=word.charAt(wi)) return false;
        //mark visited
        char ch=board[r][c];
        board[r][c]=' ';
        //movements
        if( dfs( board, word, r-1, c, wi+1)|| dfs( board, word, r+1, c, wi+1)|| dfs( board, word, r, c+1, wi+1)|| dfs( board, word, r, c-1, wi+1)) return true;
        //backtracking
        board[r][c]=ch;
        return false;
    }
}