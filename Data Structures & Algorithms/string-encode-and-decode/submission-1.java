
public class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Tìm vị trí của dấu '#'
            int j = i;
            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }
            // Độ dài của chuỗi tiếp theo
            int length = Integer.parseInt(str.substring(i, j));
            // Chuỗi thực tế bắt đầu sau dấu '#'
            String s = str.substring(j + 1, j + 1 + length);
            result.add(s);
            // Di chuyển con trỏ đến đầu của phần tử tiếp theo
            i = j + 1 + length;
        }
        return result;
    }
}