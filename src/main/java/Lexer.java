import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lexer {
    private final Stream<String> lines;

    private final List<Token> tokens = new ArrayList<>();

    private boolean isComment = false;

    public Lexer(Stream<String> lines) {
        this.lines = lines;
    }

    public void printTokens() {
        for (Token t : tokens) {
            if (t.getType() == TokenTypes.Comment) {
                continue;
            }

            System.out.println(t);
        }
    }

    private void parseLines(String s) {
        Token token;

        while (s.length() > 0) {
            int i = 0;

            while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
                i++;
            }

            s = s.substring(i);
            token = TokenTypes.matchString(s);

            if (token == null) {
                return;
            }

            if (token.type == TokenTypes.Comment) {
                tokens.add(new Token(token.type, s));

                return;
            }

            tokens.add(token);

            s = s.substring(token.value.length());
        }
    }

    public void parseTokens() {
        lines.forEach(this::parseLines);
    }
}
