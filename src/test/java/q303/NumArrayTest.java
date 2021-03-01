package q303;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumArrayTest {

    @Test
    public void sumRange() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }
}