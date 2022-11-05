// Tic tac toe game using a 2d array, player 1 goes up against player 2 ****OLD CODE, STYLE IS BETTER NOW****
package ticTacToe;
import java.util.Scanner;
public class TicTacToe {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Initialize board
    char[][] board = {{'-','-', '-', },
                      {'-','-', '-', },
                      {'-','-', '-',}};
    int col = 0;
    int row= 0;
    dB(board);   
    
    // Player 1 and 2 commands
    while(true)
    {
        System.out.println("Player 1 enter a row:");
        row = input.nextInt() - 1;
        System.out.println("Player 1 enter a column:");
        col = input.nextInt() - 1;
        CP1(board, row, col);
        CW(board, row, col);
        if(gO(board) == false)
        {
            System.out.println("Tie!");
            break;
        }
        System.out.println("Player 2 enter a row:");
        row = input.nextInt() - 1;
        System.out.println("Player 2 enter a column:");
        col = input.nextInt() - 1;
        CP2(board, row, col);
        CW(board, row, col);
        if(gO(board) == false){
            System.out.println("Tie!");
            break;
        }
    }
}

// Checks for player 1
public static void CP1 (char[][] board, int row, int col){
    Scanner z = new Scanner(System.in);
    while(board[row][col] != '-')
    {
        System.out.println();
        System.out.println("Space is already taken, try another space");
        System.out.println("Enter a row:");
        row = z.nextInt()-1;
        System.out.println("Enter a column:");
        col = z.nextInt()-1;
    }
    if(board[row][col] == '-')
    {
        board[row][col] = 'X';
        dB(board);
    }
}
    
// Checks for player 2
public static void CP2 (char[][] board, int row, int col){
    Scanner z = new Scanner(System.in);
    while(board[row][col] != '-')
    {
        System.out.println();
        System.out.println("Space is already taken, try another space");
        System.out.println("Enter a row");
        row = z.nextInt()-1;
        System.out.println("Enter a column");
        col = z.nextInt()-1;
    }
    if(board[row][col] == '-')
    {
        board[row][col] = 'O';
        dB(board);
    }
}

    
public static boolean gO(char[][] board){
    for(int row = 0; row < 3; row++)
    {
        for(int col = 0; col < 3; col++)
        {
            if(board[row][col] == '-')
            {
                return true;
            }
        }
    }
    return false;    
}

// Evaluates winner
public static void CW (char[][] board, int row, int col){
    if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
    if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
    {
        System.out.println("Player 1 wins!");
        System.exit(0); 
    }
    if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
    { 
        System.out.println("Player 2 wins!");
        System.exit(0); 
    }
    if(board[2][0] == 'O' && board[2][1] == 'X' && board[2][2] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
    if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
    {
        System.out.println("Player 2 wins!");
        System.exit(0);
    }
}

    
public static void dB(char[][] board)
{
    for(char[] row: board)
    {
        for(char c: row)
        {
            System.out.print(c);
        }  
    System.out.println();
}
    
}
}
