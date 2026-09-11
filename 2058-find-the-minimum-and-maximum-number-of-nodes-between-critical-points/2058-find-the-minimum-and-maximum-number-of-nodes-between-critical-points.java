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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[] {-1,-1};
        ListNode last = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;

        int first = -1;
        int prev = -1;
        int position = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(next!=null){
            if((curr.val>next.val && curr.val>last.val) || (curr.val<next.val && curr.val<last.val)){
                if(first==-1){
                    first = position;
                } 
                if(prev!=-1) min = Math.min(min,position-prev);
                prev = position;
                
            }
            position++;
            last = curr;
            curr = next;
            next = next.next;
        }
        if(first==-1 || first==prev) return new int[]{-1,-1};
        return new int[] {min,prev-first};
    }
}