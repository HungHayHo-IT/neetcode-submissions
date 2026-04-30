class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Chuyển thành mảng char, sắp xếp, tạo key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Nếu key chưa có thì tạo list mới, sau đó thêm str vào
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // Trả về danh sách các list con
        return new ArrayList<>(map.values());
    }
}
