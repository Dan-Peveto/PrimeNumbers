import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void testOne() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = primeFactors.resolve(1);
        assertEquals(expected, actual);
    }    
    @Test
    public void testTwo() {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        List<Integer> actual = primeFactors.resolve(2);
        assertEquals(expected, actual);
    }
}
