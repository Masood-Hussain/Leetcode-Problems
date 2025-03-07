class Solution {
    public ListNode reverseList(ListNode head) 
    {
     if (head == null) {
            return null;
        }

        ListNode lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        ListNode p = head;
        while (lastNode != p) {
            ListNode temp = p.next;
            p.next = lastNode.next;
            lastNode.next = p;
            p = temp;
        }

        return lastNode;
    }
}
