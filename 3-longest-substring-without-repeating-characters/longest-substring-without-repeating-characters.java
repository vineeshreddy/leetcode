class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       int res = 0;
       for(int i=0; i<n; i++) {
            boolean[] visited = new boolean[256];
            for(int j=i; j<n; j++) {
                if(visited[s.charAt(j)]) {
                    break;
                }
                visited[s.charAt(j)] = true;
                res = Math.max(res, (j-i+1));
            }
            visited[s.charAt(i)] = false;
        }
        return res; 

    }
}

//Time Complexity: O(n)2
//space Complexity : O(1)