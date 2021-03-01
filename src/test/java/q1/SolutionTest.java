package q1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution q1 = new Solution();
        int[] res = q1.twoSum(new int[]{2,7,11,15}, 9);
        Arrays.sort(res);
        assertArrayEquals(new int[]{0, 1}, res);
    }
}