public class sudoku {
    public static boolean issafe(int sudoku[][],int row,int col,int digit)
    {
        //row
        for(int i=0;i<=8;i++)
        {
            if(sudoku[i][col]==digit)
            {
                return false;
            }
        }
        //col
        for(int j=0;j<=8;j++)
        {
            if(sudoku[row][col]==digit)
            {
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokulover(int sudoku[][],int row,int col)
    {
        //base
        if(row==9)
        {
            return true;
        }
        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }
        //number exit cond
        if(sudoku[row][col]!=0){
            return sudokulover(sudoku,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++)
        {
            if(issafe(sudoku,row,col,digit))
            {
                sudoku[row][col]=digit;
                //baccktracking
                if(sudokulover(sudoku,nextrow,nextcol))
                {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;

    }
    public static void printsudoku(int sudoku[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
{8,2,7,0,0,9,0,1,3}};
int row=0;
int col=0;
if(sudokulover(sudoku,row,col))
{
    System.out.println("solution exist");
    printsudoku(sudoku);
}
else{
    System.out.println("sol not exist");
}

    }
    
}
