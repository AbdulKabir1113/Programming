package arrayprograms;

public class _16CheckArrayEquality {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        // Step 1: Check length
        if (a.length != b.length) {
            System.out.println("Not Array Equality");
            return;
        }

        // Step 2: Compare elements
        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        // Step 3: Final decision
        if (flag)
            System.out.println("Array Equality");
        else
            System.out.println("Not Array Equality");
    }
}