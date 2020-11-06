package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyRomanNumeralTestWithBeforeEach {

    private MyRomanNumeral roman;

    @BeforeEach
    public void initialize(){
        this.roman = new MyRomanNumeral();
    }

    @Test
    public void singleNumber(){
        int result = this.roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void numberWithManyDigits(){
        int result = this.roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void bigNumber(){
        int result = this.roman.convert("DCCLXXXIX");
        Assertions.assertEquals(789, result);
    }

    @Test
    public void biggerNumber(){
        int result = this.roman.convert("MMXIV");
        Assertions.assertEquals(2014, result);
    }

    @Test
    public void numberWithSubtractiveNotation(){
        int result = this.roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation(){
        int result = this.roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
