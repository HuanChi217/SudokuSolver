import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Board SDKBoard = new Board("src/main/resources/sudoku.sdk");
        System.out.println(SDKBoard.toString());
    }
}
