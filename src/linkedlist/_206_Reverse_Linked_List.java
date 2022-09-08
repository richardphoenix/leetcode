package linkedlist;

/**
 * @author Richard Phoenix
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class _206_Reverse_Linked_List {

    // Using recursion
    public ListNode reverseList(ListNode head) {
        // If ListNode is null or only have one element
        if (head == null || head.next == null)  return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Use iterator
    public ListNode reverseList2(ListNode head) {
        // If ListNode is null or only have one element
        if (head == null || head.next == null)  return head;

        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }

        return newHead;
    }
}
