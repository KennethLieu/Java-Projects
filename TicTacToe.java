
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    private char[][] gameBoard;
    public TicTacToe()
    {
        gameBoard = new char[3][3];
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                gameBoard[i][j] = 'N';
            }
        }
    }

    public boolean playAgain(char a, char b)
    {
        return (a=='Y' && b=='Y')||(a=='y'&&b=='y'); 
    }

    public void move(int x, int y, char z)
    {
        if((x>=4||x<=0)||(y>=4||x<=0))
        {
            System.out.println("Invalid positions!");
        }
        else
        {
            for(int i = 0; i < gameBoard.length; i++)
            {
                for(int j = 0; j < gameBoard[i].length; j++)
                {
                    if(i==(x-1)&&j==(y-1))
                    {
                        if(gameBoard[i][j]=='N')
                        {
                            gameBoard[i][j] = z; 
                        }
                        else
                        {
                            System.out.println("Slot already used!");
                        }
                    }
                }
            }
        }
    }

    public void display()
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char turn(int a)
    {
        if(a%2==0)
        {
            return 'X';
        }
        return 'O';
    }

    public boolean isTie()
    {
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                if(gameBoard[i][j]=='N')
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinner()
    {
        int c = 0;
        char[] a = {'O', 'X'};
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < gameBoard.length; j++)
            {
                for(int k = 0; k < gameBoard[0].length; k++)
                {
                    if(gameBoard[j][k]==a[i])
                    {
                        c++;
                    }
                }
                if(c==3)
                {
                    return true;
                }
                c = 0;
            }
        }
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < gameBoard[0].length; j++)
            {
                for(int k = 0; k < gameBoard.length; k++)
                {
                    if(gameBoard[k][j]==a[i])
                    {
                        c++;
                    }
                }
                if(c==3)
                {
                    return true;
                }
                c = 0;
            }
        }
        for(int i = 0; i < 2; i++)
        {
            int k = 0;
            for(int j = 0; j < gameBoard.length; j++)
            {
                if(gameBoard[j][k]==a[i])
                {
                    c++;
                }
                k++;
            }
            if(c==3)
            {
                return true;
            }
            c = 0;
        }
        for(int i = 0; i < 2; i++)
        {
            int k = 2;
            for(int j = 0; j < gameBoard.length; j++)
            {
                if(gameBoard[j][k]==a[i])
                {
                    c++;
                }
                k--;
            }
            if(c==3)
            {
                return true;
            }
            c = 0;
        }
        return false;
    }

    public char determineWinner()
    {
        int x = 0;
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                if(gameBoard[i][j]=='X')
                {
                    x++;
                }
            }
            if(x==3)
            {
                return 'X';
            }
            x = 0;
        }
        for(int i = 0; i < gameBoard[0].length; i++)
        {
            for(int j = 0; j < gameBoard.length; j++)
            {
                if(gameBoard[j][i]=='X')
                {
                    x++;
                }
            }
            if(x==3)
            {
                return 'X';
            }
            x = 0;
        }
        if((gameBoard[0][0]=='X'&&gameBoard[1][1]=='X'&&gameBoard[2][2]=='X')||(gameBoard[2][0]=='X'&&gameBoard[1][1]=='X'&&gameBoard[0][2]=='X'))
        {
            return 'X';
        }
        return 'O';
    }

    public void reset()
    {
        gameBoard = new char[3][3];
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int j = 0; j < gameBoard[i].length; j++)
            {
                gameBoard[i][j] = 'N';
            }
        }
    }
}
