package arrayprograms;

public class _8RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1, 4};

        int[] visited = new int[arr.length];

        System.out.print("Unique Elements: ");

        for (int i = 0; i < arr.length; i++) {

            if (visited[i] == 1)
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = 1;
                }
            }

            System.out.print(arr[i] + " ");
        }
    }
}