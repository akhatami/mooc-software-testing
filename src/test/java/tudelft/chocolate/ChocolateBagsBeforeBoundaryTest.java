package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    ChocolateBags bags;

    @BeforeEach
    public void beforeEachTest(){
        this.bags = new ChocolateBags();
    }
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        int result = this.bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = this.bags.calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = this.bags.calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = this.bags.calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }
}
