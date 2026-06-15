class Solution {
   public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int p : piles){
            right = Math.max(right,p);
        }

        int result = right;

        while (left<=right){
            int mid = (left + right) /2;

            long totalHours = 0;

            for (int p : piles){
                totalHours += (p-1)/mid +1;
            }
            if (totalHours <= h) {
                result = mid;       // Tốc độ này hợp lệ, lưu lại kết quả
                right = mid - 1;    // Thử tìm xem có tốc độ nào chậm hơn mà vẫn kịp không
            } else {
                left = mid + 1;     // Tốc độ này quá chậm, Koko cần ăn nhanh hơn
            }
        }
        return result;
    }
}
