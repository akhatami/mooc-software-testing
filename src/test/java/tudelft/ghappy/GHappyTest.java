package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    GHappy gHappy;

    @BeforeEach
    public void beforeAllTests(){
        this.gHappy = new GHappy();
    }

    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false"})
    public void exampleParameterizedTest(String str, boolean result){
        Assertions.assertEquals(result, this.gHappy.gHappy(str));
    }

    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({"g,false", "x,true", "gg,true", "gx,false", "xg,false"})
    public void smallInputTest(String str, boolean result){
        Assertions.assertEquals(result, this.gHappy.gHappy(str));
    }
}
