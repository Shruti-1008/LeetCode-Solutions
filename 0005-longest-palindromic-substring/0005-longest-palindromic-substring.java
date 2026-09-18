class Solution {
    int start = 0;
    int end = 0;
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);       // odd length
            expand(s, i, i + 1);   // even length
        }

        return s.substring(start, end + 1);
    }

    public void expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        left++;
        right--;

        if (right - left > end - start) {
            start = left;
            end = right;
        }
    }
}