package arrayprograms;

import java.util.Arrays;

public class _14MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] a1 = {2, 4, 6};

        int[] res = new int[a.length + a1.length];

        int i = 0, j = 0, k = 0;

        // Step 1: Compare and merge
        while (i < a.length && j < a1.length) {
            if (a[i] < a1[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = a1[j++];
            }
        }

        // Step 2: Copy remaining elements of a
        while (i < a.length) {
            res[k++] = a[i++];
        }

        // Step 3: Copy remaining elements of a1
        while (j < a1.length) {
            res[k++] = a1[j++];
        }

        System.out.println(Arrays.toString(res));
    }
}