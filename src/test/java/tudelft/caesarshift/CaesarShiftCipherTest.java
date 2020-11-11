package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize(){
        this.cipher = new CaesarShiftCipher();
    }

    @ParameterizedTest
    @CsvSource({"abc,3,def", "xyz,3,abc"})
    public void defaultTests(String message, int shift, String result){
        Assertions.assertEquals(result, this.cipher.CaesarShiftCipher(message, shift));
    }

    @ParameterizedTest
    @CsvSource({"a,-26,a", "z,-27,y"})
    public void shortInputs(String message, int shift, String result){
        Assertions.assertEquals(result, this.cipher.CaesarShiftCipher(message, shift));
    }

    @ParameterizedTest
    @CsvSource({"aaaa,0,aaaa", "zzzzz,-1,yyyyy"})
    public void longInputs(String message, int shift, String result){
        Assertions.assertEquals(result, this.cipher.CaesarShiftCipher(message, shift));
    }
}
