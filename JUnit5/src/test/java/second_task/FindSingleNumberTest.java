package second_task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindSingleNumberTest {

    @Test
    public void testCountAndReduceNoDuplicates() {
        int[] arr = {3, 7, 5};
        int result = FindSingleNumber.countAndReduce(arr);
        assertEquals(1, result);
    }

    @Test
    public void testCountAndReduceWithDuplicates() {
        int[] arr = {0, 4, 6, 6, 6, 8, 8, 7};
        int result = FindSingleNumber.countAndReduce(arr);
        assertEquals(1, result);
    }

    @Test
    public void testCountAndReduceWithMoreDuplicates() {
        int[] arr = {1, 1, 3, 2, 1};
        int result = FindSingleNumber.countAndReduce(arr);
        assertEquals(1, result);
    }

    @Test
    public void testCountAndReduceAllDuplicates() {
        int[] arr = {4, 4, 4, 4, 4};
        int result = FindSingleNumber.countAndReduce(arr);
        assertEquals(4, result);
    }
}
