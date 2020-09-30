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
    public ListNode deleteDuplicates (ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) { //cover corner cases
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] Args) {
        ListNode sample = new ListNode(1);
        sample.next = new ListNode(1);
        sample.next.next = new ListNode(1);
        sample.next.next.next = new ListNode(1);
        sample.next.next.next.next = new ListNode(5);

        Solution test = new Solution();
        sample = test.deleteDuplicates(sample);
        while (sample != null && sample.next != null) {
            System.out.print(sample.value + "->");
            sample = sample.next;
        }
        System.out.print(sample.value);
    }
}
