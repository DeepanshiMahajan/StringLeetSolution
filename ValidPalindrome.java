public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            else if (Character.toLowerCase(s.charAt(left)) ==
                     Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } 
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if (isPalindrome(s)) {
            System.out.println(" yes..it's a Palindrome");
        } else {
            System.out.println("No..it's not a Palindrome");
        }
    }
}