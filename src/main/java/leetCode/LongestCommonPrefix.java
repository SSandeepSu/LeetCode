package leetCode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return getLongestCommonPrefix(strs, 0, strs.length-1);
    }

    private static String getLongestCommonPrefix(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        }
        int mid = (start + end) / 2;
        String left = getLongestCommonPrefix(strs, start, mid);
        String right = getLongestCommonPrefix(strs, mid + 1, end);

        return getCommonPrefix(left, right);
    }

    private static String getCommonPrefix(String left, String right){
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }

}
