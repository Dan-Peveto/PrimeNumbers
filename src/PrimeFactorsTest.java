import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void testOne() {
        List<Integer> expected = listOf();
        List<Integer> actual = factorsOf(1);
        assertEquals(expected, actual);
    }    
    @Test
    public void testTwo() {
        List<Integer> expected = listOf(2);
        List<Integer> actual = factorsOf(2);
        assertEquals(expected, actual);
    }
    @Test
    public void testThree() {
        assertEquals(listOf(3), factorsOf(3));
    }
    @Test
    public void testFour() {
        assertEquals(listOf(2, 2), factorsOf(4));
    }
    @Test
    public void testFive() {
        assertEquals(listOf(2, 3), factorsOf(6));
    }
    @Test
    public void testSix() {
        assertEquals(listOf(2, 2, 2), factorsOf(8));
    }
    @Test
    public void testSever() {
        assertEquals(listOf(3, 3), factorsOf(9));
    }
    private static List<Integer> listOf(int... values) {
        List<Integer> result = new ArrayList<Integer>();
        for (int value : values) {
            result.add(value);
        }
        return result;
    }
    private static List<Integer> factorsOf(int value) {
        PrimeFactors primeFactors = new PrimeFactors();
        return primeFactors.resolve(value);
    }
}
