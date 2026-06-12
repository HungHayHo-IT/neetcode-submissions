class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1 ;

        while(first<=last){
            int mid = (first + last) /2 ;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]<target){
                first = first +1;
            }else{
                last = last -1;
            }
        }
        return -1;
    }
}
