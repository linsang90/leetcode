private boolean[][] isVisited;
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        if(m == 0) return false;
        int n = board[0].length;
        isVisited =  new boolean[m][n];
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) 
                if(board[i][j] == word.charAt(0) && searchBoard(board, word, i, j, 0)) return true;
        return false;
    }
    
    private boolean searchBoard(char[][] board, String word, int i, int j, int index) {
        if(index == word.length()) return true;
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length
            || word.charAt(index) != board[i][j] || isVisited[i][j])
            return false;
            
        isVisited[i][j] = true;
        
        if(searchBoard(board, word, i - 1, j, index + 1) || 
           searchBoard(board, word, i + 1, j, index + 1) ||
           searchBoard(board, word, i, j - 1, index + 1) || 
           searchBoard(board, word, i, j + 1, index + 1))
            return true;

        isVisited[i][j] = false;
        return false;
    }
