import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }
    public void  printBoard(){
        System.out.println("_____________");
        for (int i = 0; i < 3; i++) {
            System.out.print("|   ");
            for ( int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("_______________");
        }
    }
    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }
    public boolean checkWinner(){
        for (int i = 0; i < 3; i++){
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer
            && board[i][2] == currentPlayer){
                return true;
            }
            }
        for (int i = 0; i < 3; i++){
            if (board[0][i] == currentPlayer &&
                    board[1][i] == currentPlayer && board[2][i] == currentPlayer){
                return true;
            }
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer){
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer){
            return true;
        }
        return false;
        }
        public boolean isDraw(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
        }
        public void switchPlayer(){
        currentPlayer = (currentPlayer == 'X') ? '0' : 'x';
        }
    public static void main(String args[]){
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (true){
            game.printBoard();
            System.out.print("Игрок" + game.currentPlayer + ", введите номер строки (0-2) и столбца (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)){
                if (game.checkWinner()){
                    game.printBoard();
                    System.out.println("Игрок " + game.currentPlayer + " победил!!!! ");
                    break;
                } else if (game.isDraw()){
                    game.printBoard();
                    System.out.println("Ничья!!!!");
                    break;
                }
                game.switchPlayer();
            } else {
                System.out.println(" Неверный ход!!! Попробуйте снова. ");
            }
        }
        scanner.close();
    }
    }

