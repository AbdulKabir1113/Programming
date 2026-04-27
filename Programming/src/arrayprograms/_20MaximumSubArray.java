package arrayprograms;

public class _20MaximumSubArray {

    public static void main(String[] args) {

        int[] a = {-2,1,-3,4,-1,2,1,-5,4};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {

            int sum = 0; // reset for each starting point

            for (int j = i; j < a.length; j++) {

                sum += a[j];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println("Maximum Sum = " + max);
    }
}