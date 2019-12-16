import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class EncodingTest {
    private String inputWord;
    private String expectedResult;
    private Encoding encoding;

    @Before
    public void initialize() {
        encoding = new Encoding();
    }

    public EncodingTest(String inputWord) {
        this.inputWord = inputWord;
    }

    @Parameterized.Parameters
    public static Collection encoder() {
        return Arrays.asList(new Object[][] {
                {")()())()(()()(", "Prespecialized"},
                {"))))())))", "   ()(   "}
        });
    }

    @Test
    void encode() {
        System.out.println("Parameterized  encoding is: " + inputWord);
        assertEquals(expectedResult, encoding.encode(inputWord));
    }
}