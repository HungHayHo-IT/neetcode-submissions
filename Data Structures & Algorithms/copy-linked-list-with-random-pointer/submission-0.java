/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Map lưu cặp: [Nút cũ : Nút mới sao chép]
        Map<Node, Node> map = new HashMap<>();
        
        // Bước 1: Tạo bản sao cho từng nút và lưu vào Map
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        // Bước 2: Kết nối các con trỏ next và random cho nút mới
        curr = head;
        while (curr != null) {
            Node copyNode = map.get(curr);
            copyNode.next = map.get(curr.next);     // Lấy nút mới tương ứng của nút next cũ
            copyNode.random = map.get(curr.random); // Lấy nút mới tương ứng của nút random cũ
            curr = curr.next;
        }
        
        return map.get(head);
    }
}
