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
    public ListNode deleteDuplicates(ListNode head) {
        // use two pointers, slow - track the node before the dup nodes
        // fast - to find the last node of dups
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dummy;

        slow.next = fast;

        while (fast != null) {
            while (fast.next != null && fast.value == fast.next.value) {
                fast = fast.next; //while loop to find the last node of the dups, -- fast.next
            }
            if (slow.next != fast) {  //duplicate detected
                slow.next = fast.next;
                fast = slow.next;  // go to the node after the last dupe
            } else { // no dups, move both pointer to the right side
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] Args) {
        ListNode sample = new ListNode(1);
        sample.next = new ListNode(1);
        sample.next.next = new ListNode(1);
        sample.next.next.next = new ListNode(2);
        sample.next.next.next.next = new ListNode(3);

        Solution test = new Solution();
        sample = test.deleteDuplicates(sample);
        while (sample != null && sample.next != null) {
            System.out.println(sample.value);
            sample = sample.next;
        }
        System.out.print(sample.value);
    }
}
