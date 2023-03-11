package first_task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseAndReplaceVowelsTest {

    @Test
    void testReverseAndReplaceVowels() {
        assertEquals("dlr15w", ReverseAndReplaceVowels.reverseAndReplaceVowels("world"));
        assertEquals("1", ReverseAndReplaceVowels.reverseAndReplaceVowels("a"));
        assertEquals("dlr15w", ReverseAndReplaceVowels.reverseAndReplaceVowels("WORLD"));
        assertEquals("", ReverseAndReplaceVowels.reverseAndReplaceVowels(""));
        assertEquals("bcdfghjklmnpqrstvwxyz", ReverseAndReplaceVowels.reverseAndReplaceVowels("bcdfghjklmnpqrstvwxyz"));
    }
}