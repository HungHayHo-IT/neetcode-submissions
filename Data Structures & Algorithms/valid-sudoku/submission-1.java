class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ;i <9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                char value = board[i][j];
                if(value=='.') continue;


                String row = value + " in row" + i;
                String col = value + " in col" + j;
                String box = value + "in box" + i/3 + "-" + j/3;
                
                if(!set.add(row) || !set.add(col) || !set.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
}
