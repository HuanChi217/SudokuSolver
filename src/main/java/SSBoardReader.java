import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SSBoardReader implements BoardReader{
    public char[][] boardBuilder(String filepath) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filepath));
        char[][] element = new char[9][9];

        for (int i = 0; i < 11 ; i++) {
            String line = scan.nextLine();
            for (int j = 0; j < 11; j++) {
                if(line.charAt(j) != '|' && line.charAt(j) != '-'){
                    element[i][j] = line.charAt(j);
                }
            }

        }
        return element;
    }
}
