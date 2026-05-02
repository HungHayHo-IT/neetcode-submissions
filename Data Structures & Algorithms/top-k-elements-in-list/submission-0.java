class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Đếm tần suất của mỗi phần tử trong mảng
        Map<Integer , Integer> map = new HashMap<>();
        for(int x :nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return map.entrySet().stream()
                // Sắp xếp các phần tử theo tần suất giảm dần
                .sorted((a,b)->b.getValue().compareTo(a.getValue()))
                // 2. Map: Chuyển từ đối tượng Entry sang mỗi cái Key thôi
                .map(entry->entry.getKey())
                .limit(k)
                .mapToInt(num->num)
                .toArray();
    }
}
