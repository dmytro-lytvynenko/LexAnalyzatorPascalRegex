import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.lang.String;

public class FileReader {
    public static Lexer processFile(String path) {
        Lexer lexer = null;

        try {
            Stream<String> lines = LineSplitter.splitToLines(Files.lines(Paths.get(path)));
            lexer = new Lexer(lines);

            lexer.parseTokens();
//            lexer.printTokens();
        } catch (IOException e) {
            System.err.println("Failed to open " + path);
        }

        return lexer;
    }
}
