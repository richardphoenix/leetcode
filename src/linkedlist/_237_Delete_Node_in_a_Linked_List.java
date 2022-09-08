package linkedlist;

/**
 * @author Richard Phoenix
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class _237_Delete_Node_in_a_Linked_List {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

}
