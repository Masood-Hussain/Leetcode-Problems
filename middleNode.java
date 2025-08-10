class MiddleNodeSolution {
    public ListNode middleNode(ListNode head) {
    int count = 0;
            ListNode p = head;
    
            while (p != null) {
                count++;
                p = p.next;
            }
    
            int key = (count / 2) + 1;
    
            p = head;
            for (int i = 1; i < key; i++) {
                p = p.next;
            }
    
            return p;
        } 
    }
