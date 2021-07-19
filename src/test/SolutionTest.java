package test;

import com.main.Solutions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void testFizzBuzz(){
        Solutions s = new Solutions();
        assert(s.fizzbuzz(3).equals("FIZZ"));
        assert(s.fizzbuzz(15).equals("FIZZBUZZ"));
        assert(s.fizzbuzz(5).equals("BUZZ"));
    }
}
