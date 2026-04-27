package arrayprograms;

public class _19UnionofTwoArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2};
        int[] b = {2, 3, 4};

        // Step 1: print unique elements of a
        for (int i = 0; i < a.length; i++) {

            boolean isDuplicate = false;

            // check if already appeared before in a
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                System.out.println(a[i]);
        }

        // Step 2: print elements of b not present in a (and unique in b)
        for (int i = 0; i < b.length; i++) {

            boolean isDuplicate = false;

            // check if already appeared before in b
            for (int k = 0; k < i; k++) {
                if (b[i] == b[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate)
                continue;

            boolean isPresentInA = false;

            // check if present in a
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isPresentInA = true;
                    break;
                }
            }

            if (!isPresentInA)
                System.out.println(b[i]);
        }
    }
}