public class Solution {
    public static int countLinkedList (ListNode input) {
        if (input == null) {
            return 0;
        }

        if (input.next == null ) {
            return 1;
        }
        int count = 0;
        while (input != null) {
            count++;
            input = input.next;
        }
        return count;
    }

    public ListNode RemoveNthFromEnd (ListNode input, int n) {
        ListNode temp = input;
        for (int i = 1 ; i <= countLinkedList(temp) - n; i++ ) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next = null;
        return input;
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


