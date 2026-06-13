// LeetCode 1910 - Remove All Occurrences of a Substring

public class RemoveOccurences {
    
    public String removeOccurrences(String s, String part) {

        int m = part.length();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);

            if (sb.length() >= m &&
                sb.substring(sb.length() - m).equals(part)) {

                sb.delete(sb.length() - m, sb.length());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        RemoveOccurences r1 = new RemoveOccurences();

        String s = "daabcbaabcbc";
        String part = "abc";

        String result = r1.removeOccurrences(s, part);

        System.out.println("Output: " + result);
    }
}