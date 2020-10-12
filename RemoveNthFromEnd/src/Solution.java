public class Solution {

    public ListNode RemoveNthFromEnd (ListNode head, int n) {
        ListNode h1 = head, h2 = head;
        while (n-- > 0) {   // Go thru condition first, and then later for reduction
            h2 = h2.next;
        } //end up in the farright index of the N length

        if (h2 == null) {
            return head.next; // The head would be the Nth node from the end, so therefore to be removed.
        }

        h2 = h2.next;

        while (h2 != null) {
            h1 = h1.next;
            h2 = h2.next;
        }

        h1.next = h1.next.next; // Nth = head.next
        return head;
    }

    public static void main(String[] args) {
        ListNode sample = new ListNode(1);
        sample.next = new ListNode(2);
        sample.next.next = new ListNode(3);
        sample.next.next.next = new ListNode(4);
        sample.next.next.next.next = new ListNode(5);
        Solution test = new Solution();
        sample = test.RemoveNthFromEnd(sample, 2);
        while (sample != null && sample.next != null) {
            System.out.print(sample.value + "->");
            sample = sample.next;
        }
        System.out.print(sample.value);
    }
}


