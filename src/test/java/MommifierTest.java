import com.twu.ModifyString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void string_no_vowels(){
        String noVowels = "";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.modifyString(noVowels);
        assertEquals(expected,"");
    }


    @Test
    void string_has_vowels_modify(){
        String noVowels = "app";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.modifyString(noVowels);
        assertEquals(expected,"amommypp");
    }

    @Test
    void string_vowels_less_and_equals_thirty_percent(){
        String noVowels = "gren";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.modifyString(noVowels);
        assertEquals(expected,"gren");
    }

    @Test
    void string_vowels_more_than_thirty_percent(){
        String noVowels = "aeiou";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.modifyString(noVowels);
        assertEquals(expected,"amommyemommyimommyomommyumommy");
    }

    @Test
    void string_vowels_more_than_thirty_percent_with_upcase_character(){
        String noVowels = "AEIhh";
        ModifyString modifyString = new ModifyString();
        String expected = modifyString.modifyString(noVowels);
        assertEquals(expected,"AmommyEmommyImommyhh");
    }

}
