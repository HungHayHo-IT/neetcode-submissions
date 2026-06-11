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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevTail = dummy;

        while(true){
            ListNode check = prevTail;
            for(int i=0;i<k;i++){
                check = check.next;
                if(check==null) return dummy.next;
            }

            ListNode groupHead = prevTail.next;
            ListNode groupTail = check;
            ListNode nextGroup = groupTail.next;

            ListNode prev = nextGroup;
            ListNode curr = groupHead;
            for(int i=0;i<k;i++){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            prevTail.next = prev;      // phần trước → newHead
            prevTail = groupHead;
        }

    }
}
