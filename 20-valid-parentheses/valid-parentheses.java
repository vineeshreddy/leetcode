class Solution {
    private Map<Character, Character> map = new HashMap<Character, Character>();
    Stack<Character> sChars = new Stack<>();
    public Solution() {
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }
    public boolean isValid(String s) {
       sChars.clear();
       for(int i=0; i<s.length(); i++) {
           char ch = s.charAt(i);
           if(this.map.containsKey(ch)) {
               char topEle = sChars.isEmpty() ? '#' : sChars.pop();
               if(topEle != this.map.get(ch)) {
                   return false;
               }
           } else {
               sChars.push(ch);
           }
       }
       return sChars.isEmpty();
    }
}

