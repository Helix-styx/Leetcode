class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
        }
        ListNode prevSlow = slow;
        slow = slow.next;
        prevSlow.next = null;
        ListNode prev = null;
        ListNode fwd;

        while(slow!=null){
            fwd = slow.next;
            slow.next = prev;
            prev = slow;
            slow = fwd;
        }

        ListNode first = head;
        ListNode second = prev;

        while(first!=null && second!=null){
            ListNode firNex = first.next;
            ListNode secNex = second.next;

            first.next = second;
            second.next = firNex;

            first = firNex;
            second = secNex;
        }
    }
}