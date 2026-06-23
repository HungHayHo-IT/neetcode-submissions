class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxChar = 0;
        int maxResult = 0;
        
        for(int right = 0; right<s.length();right++){
            char c = s.charAt(right);
            
            count[c - 'A']++;
            
            maxChar = Math.max(maxChar , count[c-'A']);
            
            while((right-left +1) - maxChar >k ){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxResult = Math.max(maxResult , right - left + 1);
        }
        return maxResult;
    }
}
