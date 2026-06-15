import java.util.Arrays;

public class Permutation {

    public static boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2)
            return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Fill frequency arrays
        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(count1, count2))
            return true;

        int j = 0;

        // Sliding window
        for (int i = n1; i < n2; i++) {

            // Remove leftmost character
            count2[s2.charAt(j) - 'a']--;

            // Add new character
            count2[s2.charAt(i) - 'a']++;

            // Compare frequency arrays
            if (Arrays.equals(count1, count2))
                return true;

            j++;
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = checkInclusion(s1, s2);

        System.out.println(result);
    }
}