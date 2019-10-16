import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Board SDKBoard = new Board("src/main/resources/sudoku.sdk");
        Board SSBoard = new Board("src/main/resources/sudoku.ss");
        System.out.println(SDKBoard.toString());
        System.out.println(SSBoard.toString());
    }
}
