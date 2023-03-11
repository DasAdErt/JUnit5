package second_task;

import java.util.Arrays;

public class FindSingleNumber {
    public static int countAndReduce(int[] arr) {
        while (true) {
            int[] counts = new int[10];
            for (int i = 0; i < arr.length; i++) {
                counts[arr[i]]++;
            }

            int maxCount = Arrays.stream(counts).max().getAsInt();
            if (maxCount == 1) {
                return arr[0];
            }

            int[] newArr = new int[arr.length - maxCount];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (counts[arr[i]] != maxCount) {
                    newArr[j++] = counts[arr[i]];
                }
            }
            arr = newArr;
        }
    }
}
