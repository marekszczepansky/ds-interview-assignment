package pl.ds.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.ds.util.StringUtil.contains;

public class StringUtilTest {

    @Test
    void testIsSubstring() {
        assertEquals(false, contains(null, "qwerty"));
        assertEquals(false, contains("qwerty", null));
        assertEquals(true, contains("", ""));
        assertEquals(true, contains("abc", ""));
        assertEquals(true, contains("abc", "a"));
        assertEquals(true, contains("abc", "a*"));
        assertEquals(true, contains("a*c", "a\\*"));
        assertEquals(false, contains("a*c", "abc"));
        assertEquals(false, contains("abc", "A"));
        assertEquals(false, contains("abc", "abcd"));

        assertEquals(true, contains("a*c", "\\*c"));
        assertEquals(true, contains("abcd", "bc"));
        assertEquals(false, contains("Ala ma kota", "bc"));
        assertEquals(true, contains("Ala ma kota", "A*a m*a k*a"));
        assertEquals(true, contains("Ala ma kota", "A*a*a*a"));
        assertEquals(true, contains("Ala ma kota", "A*a*a"));
        assertEquals(true, contains("Ala ma kota", "A*a"));
        assertEquals(false, contains("Ala ma kota", "A\\*a"));
        assertEquals(false, contains("Ala ma kota", "Aa*a"));
        assertEquals(false, contains("Ala ma kota", "A*aa*a"));
        assertEquals(false, contains("Ala ma kota", "ta*ta"));
        assertEquals(true, contains("Ala ma kota", "*ta"));
        assertEquals(true, contains("Ala ma kota", "ta"));
        assertEquals(true, contains("Ala ma kota", "A*l*a* *m*a"));
        assertEquals(true, contains("Ala ma kota", "ta*"));
        assertEquals(false, contains("Ala ma kota", "ta "));
        assertEquals(true, contains("Ala ma kota", "la "));
        assertEquals(true, contains("Ala ma kota", "la *a"));
        assertEquals(true, contains("Ala ma kota", "la *a*"));
        assertEquals(true, contains("Ala ma kota", "la *ma"));
    }
}
