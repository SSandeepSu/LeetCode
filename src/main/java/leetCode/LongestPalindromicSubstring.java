package leetCode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abacde"));
    }

    private static int startIndex;
    private static int length;
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] array = s.toCharArray();
        int i = 0;
        while (i < array.length) {
            i = expandAroundCenter(array, i);
        }
        return s.substring(startIndex, startIndex + length);
    }
    private static int expandAroundCenter(char[] array, int center) {
        int start = center - 1, end = center;
        while (end < array.length - 1 && array[end] == array[end + 1]) {
            end++;
        }
        int newTail = end++;
        while (start >= 0 && end < array.length && array[start] == array[end]) {
            start--;
            end++;
        }
        if (end - start - 1 > length) {
            length = end - start - 1;
            startIndex = start + 1;
        }
        return newTail + 1;
    }
}
