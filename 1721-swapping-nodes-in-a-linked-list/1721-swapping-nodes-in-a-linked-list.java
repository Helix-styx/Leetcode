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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode fast = head;
        ListNode right = head;
        for(int i=1; i<k; i++){
            left=left.next;
        }
        for(int i =0; i<k; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            right=right.next;
        }
        int temp = right.val;
        right.val = left.val;
        left.val = temp;
        return head;
    }
}