class ListNode{
    int value;
    ListNode next;
    ListNode (int value) {
        this.value = value;
        this.next = null;
    }
}
public class Solution {
    public ListNode deleteNodes (ListNode head, int m, int n) {
        if (m == 0) {
            return null;
        }

        ListNode currNode = head;
        while (currNode != null) {
            // keep nodes
            int mCount = 0;
            while (currNode != null && mCount < m -1) {
                currNode = currNode.next;
                mCount++;
            }

            //currNode is null OR mCount hits limit
            ListNode mTemp = currNode;

            //remove nodes
            int nCount = 0;
            while (currNode != null && nCount <= n) {
                currNode = currNode.next;
                nCount++;
            }

            //Just in case mTemp is null
            if (mTemp != null) {
                mTemp.next = currNode;
            }
        }
        return head;
    }
}
