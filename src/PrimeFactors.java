import java.util.ArrayList;
import java.util.List;

/**
 * PrimeFactors
 */
public class PrimeFactors {
    public List<Integer> resolve(int value) {
        List<Integer> result = new ArrayList<Integer>();
        if(value > 1) {
            if (value % 2 == 0) {
                result.add(2);
                value /= 2;
            }
            if (value > 1) {
                result.add(value);
            }
        }
        return result;
    }
}