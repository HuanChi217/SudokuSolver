import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {

    private char[][] element;
    Board () {
        element = new char[9][9];
    }

    public char[][] readBoard(String filepath) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filepath));
        for (int i = 0; i < 9; i++) {
            String line = scan.nextLine();
            for (int j = 0; j < 9; j++) {
                char token = line.charAt(j);
                if (token == 'x') {
                    element[i][j] = '.';
                } else {
                    element[i][j] = token;
                }
            }
        }
        return element;
    }

    public String toString() {
        StringBuilder printBoard = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            printBoard.append("\n");
            for (int j = 0; j < 9; j++) {
                printBoard.append(element[i][j]);
            }
        }
        return printBoard.toString();
    }

    public static void main (String[] args) throws FileNotFoundException {
        Board board = new Board();
        board.readBoard("src/main/resources/sudoku.sdkx");
        System.out.println(board.toString());
    }
}


