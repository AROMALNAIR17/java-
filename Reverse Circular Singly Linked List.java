class Solution {
    public ListNode reverseCircular(ListNode head) {
        if (head == null || head.next == head) {
            return head; // empty or single node
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while (curr != head);

        // fix head and last node
        head.next = prev;

        return prev; // new head
    }
}
