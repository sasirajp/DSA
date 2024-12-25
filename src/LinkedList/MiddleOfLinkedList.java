package LinkedList;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        if (head.next == null) {
            return head;
        }

        while(fastPointer!=null && fastPointer.next!=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }
}
