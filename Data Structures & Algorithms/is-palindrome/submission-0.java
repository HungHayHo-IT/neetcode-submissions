class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = result.toCharArray();

        int left = 0;
        int right = arr.length- 1;
        boolean kt = true;
        while (left<right){
            if(arr[left]!=arr[right]){
                kt = false;
                break;
            }
            left++;
            right--;
        }

        return kt;
    }
}
