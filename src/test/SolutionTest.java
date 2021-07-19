package test;

import com.main.Solutions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class SolutionTest {
    @Test
    public void fiboTest(){
        Solutions s = new Solutions();
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(5);
        s1.add(8);
        Set s2 = s.printFibboTillN(1,1,10 ,null );

        assert(s1.equals(s2));
    }
}
