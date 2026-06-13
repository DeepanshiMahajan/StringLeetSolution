
public class compress {
    public int compresString(char[] chars) {

        int n = chars.length;

        int read = 0;   // Reads original characters
        int write = 0;  // Writes compressed characters

        while (read < n) {

            char currChar = chars[read]; // Current character group
            int count = 0;

            // Count frequency of current character
            while (read < n && chars[read] == currChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currChar;

            // If frequency > 1, write the count digit by digit
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // Return new length of compressed array
        return write;
    }

    public static void main(String[] args) {

        compress obj = new compress();

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int length = obj.compresString(chars);

        System.out.println("Compressed Length = " + length);

        System.out.print("Compressed Array = ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}