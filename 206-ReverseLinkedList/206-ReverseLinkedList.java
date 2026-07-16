// Last updated: 7/16/2026, 7:58:29 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next; 
            head.next = prev;        
            prev = head;               
            head = next;               
        }
        return prev;
    }
}