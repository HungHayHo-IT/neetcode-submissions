class Solution {
    public int findKthLargest(int[] nums , int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i=0;i<nums.length;i++) {
			maxHeap.offer(nums[i]);
		}
		int result = 0;
		while(k>0) {
			result = maxHeap.poll();
			k--;
		}
		
		return result;
	}
}
