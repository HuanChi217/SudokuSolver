import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Board board = new Board();
        board.readBoard("src/main/resources/sudoku.sdkx");
        System.out.println(board.toString());
    }
}
