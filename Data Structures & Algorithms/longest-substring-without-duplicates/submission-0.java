class Solution {
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int l =0 , r= 0,max =0;

        for (r =0; r<s.length();r++){
            char c = s.charAt(r);

            while (set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(c);
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
