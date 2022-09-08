package linkedlist;

/**
 * @author Richard Phoenix
 */
public class _876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
