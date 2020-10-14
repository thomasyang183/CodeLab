class ListNode {
    int value;
    ListNode next;
    ListNode(int val) {
        this.value = val;
        this.next = null;
    }

}
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        ListNode runner = head;

        while (runner != null) {
            if (runner.val == val) {
                prev.next = runner.next;
                runner = runner.next;
            } else {
                prev.next = runner;
                prev = prev.next;
                runner = runner.next;
            }
        }
        return dummyNode.next;
    }
}
