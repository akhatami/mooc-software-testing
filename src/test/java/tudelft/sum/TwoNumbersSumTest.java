package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void testSmallNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(1);
        arr2.add(1);
        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(arr1, arr2);
        int sum = result.stream()
                .mapToInt(a -> a)
                .sum();
        Assertions.assertEquals(2,sum);
    }

    @Test
    public void testBigNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(100);
        arr2.add(100);
        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(arr1, arr2);
        int sum = result.stream()
                .mapToInt(a -> a)
                .sum();
        Assertions.assertEquals(200,sum);
    }
}
