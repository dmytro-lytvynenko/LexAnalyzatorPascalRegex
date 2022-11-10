public class RegexData {
    public static final String KeywordRegEx = "(and|array|begin|break|case|const|div|do|else|end|file|interface|select|" +
            "function|for|goto|if|in|label|mod|not|of|or|packed|procedure|program|record|repeat|set|then|to|" +
            "type|until|var|while|with)";

    public static final String TypeRegEx = "(character|" +
            "string|" +
            "integer|" +
            "real|" +
            "boolean|" +
            "error)";

    public static final String HexRegEx = "0x[0-9A-Fa-f]*";

    public static final String CommentRegEx = "(/\\*|//)";

    public static final String OperatorRegEx = "(\\+|\\&|\\+\\=|\\&\\=|=\\=|\\!\\=|" +
                    "\\-|\\||\\-\\=|\\|\\=|\\|\\||\\<|\\<\\=|" +
                    "\\*|\\^|\\*\\=|\\^\\=|\\<\\-|\\>|\\>\\=|" +
                    "\\/|\\<\\<|\\/\\=|\\+\\+|\\=|\\:\\=|" +
                    "\\%|\\>\\>|\\%\\=|\\-\\-|\\!|" +
                    "\\&\\^|\\&\\^\\=|\\~)";

    public static final String PunctuationRegEx = "(\\[|]|\\(|\\)|\\{|\\}|\\;|\\.|\\,)";

    public static final String IdentifierRegEx = "[_A-Za-z][0-9A-Za-z_]*";

    public static final String IntegerRegEx = "([1-9][0-9]*|0)";

    public static final String FloatRegEx = "([1-9][0-9]*|0)\\.[0-9]*";

    public static final String CharRegEx = "'[^']+'";

    public static final String StringRegEx = "\"(?:\\\\\"|[^\"])*?\"";
}
