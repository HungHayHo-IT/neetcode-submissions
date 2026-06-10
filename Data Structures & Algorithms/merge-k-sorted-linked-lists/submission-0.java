/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> results = new ArrayList<>();

        for(ListNode head: lists){
            ListNode curr = head;
            while(curr!=null){
                results.add(curr.val);
                curr = curr.next;
            }
        }

        results.sort((o1, o2) -> o1-o2);

        ListNode dumby = new ListNode(0);
        ListNode current = dumby;

        for(int val : results){
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dumby.next;

    }
}
