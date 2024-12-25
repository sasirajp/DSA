package LinkedList;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd = new ListNode(-1), oddTail = odd;
        ListNode even = new ListNode(-1), evenTail = even;
        ListNode cur = head;
        int index = 1;
        while(cur!=null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = null;
            if(index%2 == 1) {
                oddTail.next = temp;
                oddTail = oddTail.next;
            } else {
                evenTail.next = temp;
                evenTail = evenTail.next;
            }
            index++;
        }
        oddTail.next = even.next;
        return odd.next;
    }
}
