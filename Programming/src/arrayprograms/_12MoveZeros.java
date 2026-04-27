package arrayprograms;

import java.util.Arrays;

public class _12MoveZeros {

    public static void main(String[] args) {

        int[] a = {1, 2, 0, 5, 0, 17, 0, 8};

        int j = 0; // position for next non-zero

        // Step 1: move non-zero elements forward
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }

        // Step 2: fill remaining with zeros
        while (j < a.length) {
            a[j++] = 0;
        }

        System.out.println(Arrays.toString(a));
    }
}
