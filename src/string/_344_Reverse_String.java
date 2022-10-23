package string;

/**
 * https://leetcode.com/problems/reverse-string/
 * @author Richard Phoenix
 */
public class _344_Reverse_String {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while (start <= end) {
            char tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;
            start++;
            end--;
        }
    }
}
