class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = new char[26];
            for(int i = 0;i< str.length();i++){
                arr[str.charAt(i) - 'a']++;
            }

            String key = new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);

        }
        List<List<String>> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
    }
}
