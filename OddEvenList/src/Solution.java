class ListNode {
    int value;
    ListNode next;
    ListNode (int value) {
        this.value = value;
        this.next = null;
    }
}
public class Solution {
    /*
    / The logic is this, we are trying to solve this problem with a space complexity no more than O(1), meaning no additional data structures in this case
    / As of the time complexity which is O(n), we would likely traverse the linked list from front to end
    / This problem is similar to the one where a linked list is partition, which is essentially a joint problem
    / a joint problem happens with two pointers. We shall leverage the same way of thinking to solve this problem
    / Let's have the first linked list to
     */
    public ListNode oddEvenList(ListNode head) {

        ListNode odd =  new ListNode(0);
        ListNode odd_head = odd;
        ListNode even = new ListNode(0);
        ListNode even_head = even;
        int count = 1;

        if (head == null) {
            return null;
        }

        while (head != null) {
            if (count % 2 == 0) {
                even_head.next = head;
                even_head = even_head.next;
            } else {
                odd_head.next = head;
                odd_head = odd_head.next;
            }
            head = head.next;
            count++;
        }

        even_head.next = null;
        odd_head.next = even.next;
        return odd.next;

    }

    public static void main(String[] Args) {

        ListNode sample = new ListNode(1);
        sample.next = new ListNode(2);
        sample.next.next = new ListNode(3);
        sample.next.next.next = new ListNode(4);
        sample.next.next.next.next = new ListNode(5);
        sample.next.next.next.next.next = null;
        Solution test = new Solution();
        sample = test.oddEvenList(sample);
        while (sample != null) {
            System.out.println(sample.value);
            sample = sample.next;
        }
    }

}
