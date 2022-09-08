package linkedlist;

/**
 * @author Richard Phoenix
 */
public class _203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode target = head;
        while (target != null) {
            if (target.val == val) {
                prev.next = target.next;
            } else {
                prev = target;
            }
            target = target.next;
        }
        return dummyNode.next;
    }
}
