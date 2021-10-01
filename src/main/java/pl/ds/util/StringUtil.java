package pl.ds.util;

public final class StringUtil {

    private StringUtil() {
        // no instances
    }

    /**
     * <p>Checks if a {@code string} contains a {@code pattern}.</p>
     *
     * <p>A pattern may contain single or multiple wildcard characters {@code *}.
     * Each occurrence of {@code *} in the {@code pattern} means that it can be a match for
     * zero or more characters of the {@code string}.</p>
     *
     * <p>Asterisk (*) is considered as a regular character, if it is preceded by a backslash (\)
     * in a pattern. Backslash (\) is considered as a regular character in all cases other
     * than preceding the asterisk (*).</p>
     *
     * <p>Examples:</p>
     * <pre>
     * StringUtils.contains(null, *) = false
     * StringUtils.contains(*, null) = false
     * StringUtils.contains("", "") = true
     * StringUtils.contains("abc", "") = true
     * StringUtils.contains("abc", "a") = true
     * StringUtils.contains("abc", "a*") = true
     * StringUtils.contains("a*c", "a\*") = true
     * StringUtils.contains("a*c", "abc") = false
     * StringUtils.contains("abc", "A") = false
     * StringUtils.contains("abc", "abcd") = false
     * </pre>
     *
     * @param string  string to check
     * @param pattern pattern to search in a string
     * @return true if the {@code string} contains a {@code pattern}, false otherwise.
     */
    public static boolean contains(String string, String pattern) {
        return contains(string, pattern, false);
    }

    private static boolean contains(String string, String pattern, boolean strict) {
        if (string == null || pattern == null) return false;
        if (pattern.isEmpty()) return true;
        if (string.isEmpty()) return pattern.equals("*");

        char term = pattern.charAt(0);
        String substring = string.substring(1);
        String subpattern = pattern.substring(1);

        if (term == '*') {
            return contains(substring, pattern, true) || contains(string, subpattern, false);
        }
        if (term == '\\' && pattern.length() > 1 && pattern.charAt(1) == '*') {
            subpattern = pattern.substring(2);
            term = '*';
        }
        return string.charAt(0) == term && contains(substring, subpattern, true) ||
                !strict && contains(substring, pattern, false);
    }
}
