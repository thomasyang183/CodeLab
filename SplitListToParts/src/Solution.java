class ListNode{
    int value;
    ListNode next;
    ListNode (int val) {
        this.value = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode[] splitListToParts (ListNode root, int k) {

        ListNode[] res = new ListNode[k]; //Create result ListNode array

        int length = 0;
        ListNode runner = root;
        while (runner != null) {
            length++;
            runner = runner.next;
        }

        int numOfElementPerPart = length / k;
        int nodeWithExtraItem = length % k;
        runner = root;
        for (int i = 0; i < k && runner != null; i++) {
            res[i] = runner;
            int counter = nodeWithExtraItem-- > 0? numOfElementPerPart + 1: numOfElementPerPart; // I couldn't figure this out
            while (counter -- > 1) {
                runner = runner.next;
            }
            ListNode next = runner.next;
            runner.next = null;
            runner = next;
        }
        return res;

    }
}
