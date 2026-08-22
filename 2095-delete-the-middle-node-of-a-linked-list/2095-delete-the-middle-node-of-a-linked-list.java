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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head=null;
        ListNode fp=head;
        ListNode middle=head;
        ListNode sp=head;
        
            fp = fp.next.next;
            middle = middle.next;
        
        while(fp!=null && fp.next!=null){
            fp=fp.next.next;
            middle=middle.next;
            sp= sp.next;
        }
        sp.next = sp.next.next;
        return head;
    }
}