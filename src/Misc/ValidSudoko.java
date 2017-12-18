package Misc;

import java.util.HashSet;

class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> visit=new HashSet<String>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num=board[i][j];
                if(num != '.')
                    if(!visit.add(num+"r"+i) || !visit.add(num+"c"+j) || !visit.add(num+ "-"+(i/3)+"-"+(j/3)) )
                        return false;            
                
            }
        }
        return true;
    }
}