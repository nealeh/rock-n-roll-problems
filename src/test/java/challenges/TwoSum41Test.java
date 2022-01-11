package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum41Test {

    @Test
    public void testSum() {
        assertArrayEquals(new int[] {30,11}, TwoSum41.sum(new int[]{12,30,33,11,10}));
        assertArrayEquals(new int[] {}, TwoSum41.sum(new int[]{16,7,14,1,30}));
        assertArrayEquals(new int[] {}, TwoSum41.sum(new int[]{35,24,9,11,1}));
        assertArrayEquals(new int[] {36,5}, TwoSum41.sum(new int[]{36,4,5,20,10}));
        assertArrayEquals(new int[] {11,30}, TwoSum41.sum(new int[]{40,11,2,30,12}));
    }

}