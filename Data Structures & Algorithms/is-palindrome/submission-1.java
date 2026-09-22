class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
        }

        int l = 0;
        int r = builder.length()-1;
        while (l<r){
            if(builder.charAt(l)!=builder.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
