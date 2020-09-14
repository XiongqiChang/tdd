import com.twu.ModifyString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void string_no_vowels(){
        String noVowels = "green";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.addMommy(noVowels);
        assertEquals(expected,"green");
    }

    @Test
    void string_vowels_less_thirty_percent(){
        String noVowels = "green";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.addMommy(noVowels);
        assertEquals(expected,"green");
    }
}
