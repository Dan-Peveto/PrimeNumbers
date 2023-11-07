import java.util.ArrayList;
import java.util.List;

/**
 * PrimeFactors
 */
public class PrimeFactors {
    public List<Integer> resolve(int value) {
        List<Integer> result = new ArrayList<Integer>();
        if(value > 1) {
            result.add(2);
        }
        return result;
    }
}