package stringprograms;

public class _12FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "programming";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = false;

            for (int j = 0; j < s.length(); j++) {  // ✅ Full string scan
                if (i != j && s.charAt(j) == c) {   // ✅ Skip same index
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(c);
                return;
            }
        }

        System.out.println(-1);  // ✅ No non-repeating character found
    }
}