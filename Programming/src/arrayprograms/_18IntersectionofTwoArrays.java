package arrayprograms;

public class _18IntersectionofTwoArrays {

    public static void main(String[] args) {

        int[] a = {1, 1, 2};
        int[] b = {1, 2};

        for (int i = 0; i < a.length; i++) {

            // Step 1: check if already processed (avoid duplicates in a)
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate)
                continue;

            // Step 2: check intersection
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}