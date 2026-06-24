class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return  false;

        int[] s1_counts = new int[26];
        int[] s2_counts = new int[26];
        int s1_length = s1.length();

        for(int i = 0;i<s1_length;i++){
            s1_counts[s1.charAt(i) - 'a']++;
            s2_counts[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1_counts,s2_counts)) return true;


        for(int i = s1_length ;i<s2.length();i++){

            s2_counts[s2.charAt(i) - 'a']++;

            s2_counts[s2.charAt(i - s1_length) - 'a']--;

            if(Arrays.equals(s1_counts,s2_counts)){
                return true;
            }
        }

        return false;
    }
}
