class Solution {
    public String longestPalindrome(String s) {
        final int n = s.length();
        for(int end=n-1; end>=0; end--) {
            for(int start=0; start<=(n-1-end); start++) {
                if(isPalindrome(s, start, (start+end))) {
                    return s.substring(start, start+end+1);
                }
            }
        }
        return "";
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}