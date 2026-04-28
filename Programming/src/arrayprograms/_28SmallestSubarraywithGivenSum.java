package arrayprograms;

public class _28SmallestSubarraywithGivenSum {

    public static void main(String[] args) {

        int[] a = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            int sum = 0;

            for (int j = i; j < a.length; j++) {

                sum += a[j];

                if (sum >= target) {

                    int len = j - i + 1;

                    if (len < minLen) {
                        minLen = len;
                    }

                    break; // smallest for this i
                }
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("No subarray found");
        else
            System.out.println("Length = " + minLen);
    }
}