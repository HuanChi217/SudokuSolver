import java.io.FileNotFoundException;

public interface BoardReader {
    char[][] boardBuilder(String filePath) throws FileNotFoundException;
}
