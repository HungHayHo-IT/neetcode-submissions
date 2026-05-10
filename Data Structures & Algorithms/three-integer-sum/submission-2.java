class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Bước 1: sort mảng
        Arrays.sort(nums);

        // Bước 2: duyệt từng phần tử
        for (int i = 0; i < nums.length - 2; i++) {

            // Bỏ qua phần tử trùng
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Two pointers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    // Bỏ qua phần tử trùng bên trái
                    while (left < right &&
                           nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Bỏ qua phần tử trùng bên phải
                    while (left < right &&
                           nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return result;
    }

}