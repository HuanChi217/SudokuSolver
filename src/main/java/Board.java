import java.io.FileNotFoundException;

public class Board {

    private char[][] element;

    public Board (String filePath) throws FileNotFoundException {
        BoardReader input = BoardReaderFactory.boardType(filePath);
        element = input.boardBuilder(filePath);
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
}


