// You are given a string s consisting only of lowercase English letters.

// In one move, you can select any two adjacent characters of s and swap them.

// Return the minimum number of moves needed to make s a palindrome.

// Note that the input will be generated such that s can always be converted to a palindrome.
public class Palindrome {
    static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    static int minMovesToMakePalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        int ans = 0;
        StringBuilder sb = new StringBuilder(s);

        while (start < end) {
            int l = start;
            int r = end;

            while (sb.charAt(l) != sb.charAt(r)) {
                r--;
            }

            // means only one character in string that must be at center
            if (l == r) {
                swap(sb, r, r + 1);
                ans++;
                continue;
            } else {
                if (r < end) {
                    swap(sb, r, end);
                    ans++;
                    r++;
                }
            }
            start++;
            end--;
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "letelt";
        System.out.println(minMovesToMakePalindrome(s));
    }
}
