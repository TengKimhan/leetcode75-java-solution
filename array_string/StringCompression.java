package array_string;

public class StringCompression {
    public static void main(String[] args) {
        StringCompression compressor = new StringCompression();

        char[] testInput1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        assert compressor.compress(testInput1) == 6 && new String(testInput1, 0, 6).equals("a2b2c3")
                : "Test case 1 failed";

        char[] testInput2 = { 'a' };
        assert compressor.compress(testInput2) == 1 && new String(testInput2, 0, 1).equals("a") : "Test case 2 failed";

        char[] testInput3 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        assert compressor.compress(testInput3) == 4 && new String(testInput3, 0, 4).equals("ab12")
                : "Test case 3 failed";

        System.out.println("All test cases passed!");

    }

    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < chars.length) {
            int freq = 0;
            char currentChar = chars[readIndex];

            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                freq++;
                readIndex++;
            }
            chars[writeIndex] = currentChar;
            if (freq > 1) {
                for (char ch : Integer.toString(freq).toCharArray()) {
                    chars[writeIndex + 1] = ch;
                    writeIndex++;
                }
            }
            writeIndex++;
        }
        return writeIndex;
    }

}
