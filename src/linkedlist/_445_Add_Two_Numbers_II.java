package linkedlist;

/**
 * @author Richard Phoenix
 */
public class _445_Add_Two_Numbers_II {
    public ListNode reverseList(ListNode head) {
        // If ListNode is null or only have one element
        if (head == null || head.next == null)  return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode node = new ListNode();
        ListNode curr = node;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return reverseList(node.next);
    }
}
