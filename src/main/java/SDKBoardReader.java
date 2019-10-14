import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDKBoardReader implements BoardReader{
    public char[][] boardBuilder(String filepath) throws FileNotFoundException {
        char[][] element = new char[9][9];
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
}
