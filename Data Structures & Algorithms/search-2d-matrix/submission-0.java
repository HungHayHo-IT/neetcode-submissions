class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int first = 0;
        int last = m*n-1;

        while (first<=last){

            int mid = (first + last)/2;
            int row = mid/n;
            int cow = mid%n;
            int val = matrix[row][cow];

            if(val==target) {
                return true;
            }else if(val<target){
                first = mid+1;
            }else{
                last = mid -1;
            }

        }
        return false;
    }
}
