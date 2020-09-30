class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.value = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.value = val;
        this.next = next;
    }
}
public class Solution {
    public ListNode insert(ListNode head, int val) {
        if (head == null) {
            ListNode newNode = new ListNode(val, null);
            newNode.next = newNode;
            return newNode;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        boolean toInsert = false;

        do {
            if (prev.value <= val && val <= curr.value) {
                // case 1
                toInsert = true;
            } else if (prev.value > curr.value) {
                // case 2
                if (val >= prev.value || val <= curr.value) {
                    toInsert = true;
                }
            }

            if (toInsert) {
                prev.next = new ListNode(val, curr);
                return head;
            }

            prev = curr;
            curr = curr.next;
        } while (prev != head);

        // case 3
        prev.next = new ListNode(val, curr);
        return head;
    }

    public static void main(String[] args) {
        ListNode sample = new ListNode(3);
        sample.next = new ListNode(4);
        sample.next.next = new ListNode(1);
        sample.next.next.next = sample;
        Solution test = new Solution();
        sample = test.insert(sample,2);
        
        // This is the wrong of doing so. Please discard the below
        while (sample.next != null) {
            System.out.println(sample.value);
            sample = sample.next;
        }
    }
}
