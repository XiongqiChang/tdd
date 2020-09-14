import com.twu.ModifyString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void string_no_vowels(){
        String noVowels = "";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.addMommy(noVowels);
        assertEquals(expected,"");
    }

    @Test
    void string_vowels_less_and_equals_thirty_percent(){
        String noVowels = "grn";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.addMommy(noVowels);
        assertEquals(expected,"grn");
    }
    @Test
    void string_vowels_more_than_thirty_percent(){
        String noVowels = "app";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.addMommy(noVowels);
        assertEquals(expected,"amommypp");
    }
}
