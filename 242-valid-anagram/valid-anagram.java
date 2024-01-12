class Solution {
    public boolean isAnagram(String s, String t) {
        // if the length of both the strings are not equal returns False
        if (s.length() != t.length()) return false;
        // because there are 26 letters [26]
        int[] char_count = new int[26]; 
        //lets increment the letters in s and decrement in t
        // if s has 3 a's and t has 3 a's so s become +3 and t becomes -3 and 0
        
        for (int i=0; i<s.length(); i++) {
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
        for (int count : char_count){
            if ( count != 0){
                return false;
            }
        }
        return true;
    }
}