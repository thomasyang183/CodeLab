class ListNode {
    int value;
    ListNode next;

    // Constructor to create a new node
    // Next is by default initialized as null
    ListNode (int val) {
        this.value = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode partition (ListNode head, int x) {

        // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists
        // all of these are initialized with the dummy nodes created

        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            // if the original list node is lesser than the given x
            // assign it to the before list
            if (head.value < x) {
                before.next = head;
                before = before.next;
            } else {
                // if the original list node is greater or equal to the given x
                // assign it to the after list
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        // last node of 'after' list would also be ending node of the reformed list
        after.next = null;

        // once all the nodes are correctly assigned to the two lists
        // combine them to form a single linked list which would be returned

        before.next = after_head.next;  // note that you should not refer to the dummy node

        return before_head.next; // note that you should not refer to the dummy node
    }
}
