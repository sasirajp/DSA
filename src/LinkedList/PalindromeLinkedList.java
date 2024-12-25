package LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head.next==null)
        {
            return true;
        }

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null, cur = slow;

        while(cur!=null) {
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        while(prev!=null) {
            if(prev.val!=head.val) return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
}
